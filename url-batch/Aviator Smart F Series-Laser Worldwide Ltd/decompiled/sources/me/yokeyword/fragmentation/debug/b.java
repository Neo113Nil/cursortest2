package me.yokeyword.fragmentation.debug;

import android.R;
import android.content.DialogInterface;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentationMagician;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.yokeyword.fragmentation.R$drawable;
import me.yokeyword.fragmentation.d;

/* loaded from: classes5.dex */
public class b implements SensorEventListener {
    private FragmentActivity mActivity;
    private SensorManager mSensorManager;
    private AlertDialog mStackDialog;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.showFragmentStackHierarchyView();
        }
    }

    /* renamed from: me.yokeyword.fragmentation.debug.b$b, reason: collision with other inner class name */
    private class ViewOnTouchListenerC0371b implements View.OnTouchListener {
        private int clickLimitValue;
        private float dX;
        private float downX;
        private boolean isClickState;
        private View stackView;
        private float dY = 0.0f;
        private float downY = 0.0f;

        ViewOnTouchListenerC0371b(View view, int i8) {
            this.stackView = view;
            this.clickLimitValue = i8;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                            return false;
                        }
                    } else if (Math.abs(rawX - this.downX) >= this.clickLimitValue || Math.abs(rawY - this.downY) >= this.clickLimitValue || !this.isClickState) {
                        this.isClickState = false;
                        this.stackView.setX(motionEvent.getRawX() + this.dX);
                        this.stackView.setY(motionEvent.getRawY() + this.dY);
                    } else {
                        this.isClickState = true;
                    }
                }
                if (rawX - this.downX < this.clickLimitValue && this.isClickState) {
                    this.stackView.performClick();
                }
            } else {
                this.isClickState = true;
                this.downX = rawX;
                this.downY = rawY;
                this.dX = this.stackView.getX() - motionEvent.getRawX();
                this.dY = this.stackView.getY() - motionEvent.getRawY();
            }
            return true;
        }
    }

    public b(FragmentActivity fragmentActivity) {
        this.mActivity = fragmentActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void addDebugFragmentRecord(List<me.yokeyword.fragmentation.debug.a> list, Fragment fragment) {
        CharSequence charSequence;
        if (fragment != 0) {
            int backStackEntryCount = fragment.getFragmentManager().getBackStackEntryCount();
            CharSequence simpleName = fragment.getClass().getSimpleName();
            if (backStackEntryCount == 0) {
                charSequence = span(simpleName, " *");
            } else {
                for (int i8 = 0; i8 < backStackEntryCount; i8++) {
                    FragmentManager.BackStackEntry backStackEntryAt = fragment.getFragmentManager().getBackStackEntryAt(i8);
                    if ((backStackEntryAt.getName() != null && backStackEntryAt.getName().equals(fragment.getTag())) || (backStackEntryAt.getName() == null && fragment.getTag() == null)) {
                        break;
                    }
                    if (i8 == backStackEntryCount - 1) {
                        simpleName = span(simpleName, " *");
                    }
                }
                charSequence = simpleName;
            }
            if ((fragment instanceof d) && ((d) fragment).isSupportVisible()) {
                charSequence = span(charSequence, " ☀");
            }
            list.add(new me.yokeyword.fragmentation.debug.a(charSequence, getChildFragmentRecords(fragment)));
        }
    }

    private List<me.yokeyword.fragmentation.debug.a> getChildFragmentRecords(Fragment fragment) {
        ArrayList arrayList = new ArrayList();
        List<Fragment> activeFragments = FragmentationMagician.getActiveFragments(fragment.getChildFragmentManager());
        if (activeFragments == null || activeFragments.size() < 1) {
            return null;
        }
        for (int size = activeFragments.size() - 1; size >= 0; size--) {
            addDebugFragmentRecord(arrayList, activeFragments.get(size));
        }
        return arrayList;
    }

    private List<me.yokeyword.fragmentation.debug.a> getFragmentRecords() {
        ArrayList arrayList = new ArrayList();
        List<Fragment> activeFragments = FragmentationMagician.getActiveFragments(this.mActivity.getSupportFragmentManager());
        if (activeFragments == null || activeFragments.size() < 1) {
            return null;
        }
        Iterator<Fragment> it = activeFragments.iterator();
        while (it.hasNext()) {
            addDebugFragmentRecord(arrayList, it.next());
        }
        return arrayList;
    }

    private void processChildLog(List<me.yokeyword.fragmentation.debug.a> list, StringBuilder sb, int i8) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            me.yokeyword.fragmentation.debug.a aVar = list.get(i9);
            for (int i10 = 0; i10 < i8; i10++) {
                sb.append("\t\t\t");
            }
            if (i9 == 0) {
                sb.append("\t子栈顶\t\t");
                sb.append(aVar.fragmentName);
                sb.append("\n\n");
            } else {
                if (i9 == list.size() - 1) {
                    sb.append("\t子栈底\t\t");
                    sb.append(aVar.fragmentName);
                    sb.append("\n\n");
                    processChildLog(aVar.childFragmentRecord, sb, i8 + 1);
                    return;
                }
                sb.append("\t↓\t\t\t");
                sb.append(aVar.fragmentName);
                sb.append("\n\n");
            }
            processChildLog(aVar.childFragmentRecord, sb, i8);
        }
    }

    @NonNull
    private CharSequence span(CharSequence charSequence, String str) {
        return ((Object) charSequence) + str;
    }

    public void logFragmentRecords(String str) {
        List<me.yokeyword.fragmentation.debug.a> fragmentRecords = getFragmentRecords();
        if (fragmentRecords == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int size = fragmentRecords.size() - 1; size >= 0; size--) {
            me.yokeyword.fragmentation.debug.a aVar = fragmentRecords.get(size);
            if (size == fragmentRecords.size() - 1) {
                sb.append("═══════════════════════════════════════════════════════════════════════════════════\n");
                if (size == 0) {
                    sb.append("\t栈顶\t\t\t");
                    sb.append(aVar.fragmentName);
                    sb.append("\n");
                    sb.append("═══════════════════════════════════════════════════════════════════════════════════");
                } else {
                    sb.append("\t栈顶\t\t\t");
                    sb.append(aVar.fragmentName);
                    sb.append("\n\n");
                }
            } else {
                if (size == 0) {
                    sb.append("\t栈底\t\t\t");
                    sb.append(aVar.fragmentName);
                    sb.append("\n\n");
                    processChildLog(aVar.childFragmentRecord, sb, 1);
                    sb.append("═══════════════════════════════════════════════════════════════════════════════════");
                    Log.i(str, sb.toString());
                    return;
                }
                sb.append("\t↓\t\t\t");
                sb.append(aVar.fragmentName);
                sb.append("\n\n");
            }
            processChildLog(aVar.childFragmentRecord, sb, 1);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i8) {
    }

    public void onCreate(int i8) {
        if (i8 != 1) {
            return;
        }
        SensorManager sensorManager = (SensorManager) this.mActivity.getSystemService("sensor");
        this.mSensorManager = sensorManager;
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(1), 3);
    }

    public void onDestroy() {
        SensorManager sensorManager = this.mSensorManager;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
    }

    public void onPostCreate(int i8) {
        if (i8 != 2) {
            return;
        }
        View findViewById = this.mActivity.findViewById(R.id.content);
        if (findViewById instanceof FrameLayout) {
            ImageView imageView = new ImageView(this.mActivity);
            imageView.setImageResource(R$drawable.fragmentation_ic_stack);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = GravityCompat.END;
            int applyDimension = (int) TypedValue.applyDimension(1, 18.0f, this.mActivity.getResources().getDisplayMetrics());
            layoutParams.topMargin = applyDimension * 7;
            layoutParams.rightMargin = applyDimension;
            imageView.setLayoutParams(layoutParams);
            ((FrameLayout) findViewById).addView(imageView);
            imageView.setOnTouchListener(new ViewOnTouchListenerC0371b(imageView, applyDimension / 4));
            imageView.setOnClickListener(new a());
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        int type = sensorEvent.sensor.getType();
        float[] fArr = sensorEvent.values;
        if (type == 1) {
            float f8 = 12;
            if (Math.abs(fArr[0]) >= f8 || Math.abs(fArr[1]) >= f8 || Math.abs(fArr[2]) >= f8) {
                showFragmentStackHierarchyView();
            }
        }
    }

    public void showFragmentStackHierarchyView() {
        AlertDialog alertDialog = this.mStackDialog;
        if (alertDialog == null || !alertDialog.isShowing()) {
            DebugHierarchyViewContainer debugHierarchyViewContainer = new DebugHierarchyViewContainer(this.mActivity);
            debugHierarchyViewContainer.bindFragmentRecords(getFragmentRecords());
            debugHierarchyViewContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            AlertDialog create = new AlertDialog.Builder(this.mActivity).setView(debugHierarchyViewContainer).setPositiveButton(R.string.cancel, (DialogInterface.OnClickListener) null).setCancelable(true).create();
            this.mStackDialog = create;
            create.show();
        }
    }
}
