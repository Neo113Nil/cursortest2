package com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.databinding.LayoutNewWatchFacePointerPreviewBinding;
import com.crrepa.band.my.databinding.LayoutNewWatchFacePointerStyleBinding;
import com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.model.ClockPointerBean;
import com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.model.ClockPointerModel;
import com.crrepa.band.my.device.watchfacenew.photo.widgets.DraggableLinearLayout;
import com.crrepa.ble.conn.bean.CRPJieliWatchFaceLayoutInfo;
import com.crrepa.ble.conn.type.CRPPhotoWatchFaceDisplayMode;
import com.crrepa.ble.conn.type.CRPWatchFaceType;
import com.moyoung.dafit.module.common.utils.x0;
import com.moyoung.dafit.module.common.widgets.decoration.SpacesItemDecoration;
import com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public class s implements d {
    private final t labelPresenter;
    private final f pointerPreviewDelegate;
    private PointerStyleAdapter pointerStyleAdapter;
    private final LayoutNewWatchFacePointerStyleBinding pointerStyleBinding;
    private final LayoutNewWatchFacePointerPreviewBinding previewBinding;
    private final CRPWatchFaceType watchFaceType;
    private final CompositeDisposable disposableList = new CompositeDisposable();
    private final ClockPointerModel clockPointerModel = new ClockPointerModel();

    public s(final LayoutNewWatchFacePointerPreviewBinding layoutNewWatchFacePointerPreviewBinding, LayoutNewWatchFacePointerStyleBinding layoutNewWatchFacePointerStyleBinding, CRPWatchFaceType cRPWatchFaceType) {
        this.previewBinding = layoutNewWatchFacePointerPreviewBinding;
        this.pointerStyleBinding = layoutNewWatchFacePointerStyleBinding;
        this.watchFaceType = cRPWatchFaceType;
        this.pointerPreviewDelegate = new f(layoutNewWatchFacePointerPreviewBinding, false);
        this.labelPresenter = new t(this, cRPWatchFaceType);
        layoutNewWatchFacePointerPreviewBinding.includeLabel0.dragLayout.setDragEnabled(true);
        layoutNewWatchFacePointerPreviewBinding.includeLabel1.dragLayout.setDragEnabled(true);
        layoutNewWatchFacePointerPreviewBinding.includeLabel2.dragLayout.setDragEnabled(true);
        layoutNewWatchFacePointerPreviewBinding.includeLabel3.dragLayout.setDragEnabled(true);
        initViewListener();
        initPointerRv();
        layoutNewWatchFacePointerPreviewBinding.rlPointerLabelRoot.post(new Runnable() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.p
            @Override // java.lang.Runnable
            public final void run() {
                s.this.lambda$new$0(layoutNewWatchFacePointerPreviewBinding);
            }
        });
    }

    private String[] getLabelNameArray() {
        return com.moyoung.dafit.module.common.utils.d.get().getResources().getStringArray(R.array.watch_face_pointer_label_array);
    }

    private void initPointerRv() {
        this.pointerStyleAdapter = new PointerStyleAdapter();
        ClockPointerBean clockPointerBean = new ClockPointerBean();
        clockPointerBean.id = 0;
        clockPointerBean.isNonePointer = true;
        this.pointerStyleAdapter.addData((PointerStyleAdapter) clockPointerBean);
        this.pointerStyleAdapter.notifyDataSetChanged();
        this.pointerStyleBinding.rvPoint.setLayoutManager(new LinearLayoutManager(com.moyoung.dafit.module.common.utils.d.get(), 0, false));
        this.pointerStyleBinding.rvPoint.addItemDecoration(new SpacesItemDecoration(com.moyoung.dafit.module.common.utils.o.dp2px(com.moyoung.dafit.module.common.utils.d.get(), 10.0f)));
        this.pointerStyleBinding.rvPoint.setAdapter(this.pointerStyleAdapter);
        this.pointerStyleAdapter.setOnItemClickListener(new OnItemClickListener() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.q
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                s.this.lambda$initPointerRv$10(baseQuickAdapter, view, i8);
            }
        });
    }

    @SuppressLint({"NonConstantResourceId"})
    private void initViewListener() {
        initWheelPicker(0);
        initWheelPicker(1);
        initWheelPicker(2);
        initWheelPicker(3);
        this.pointerStyleBinding.includeColorPicker.rgColor.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.k
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i8) {
                s.this.lambda$initViewListener$3(radioGroup, i8);
            }
        });
        this.previewBinding.includeLabel0.dragLayout.setDragListener(new DraggableLinearLayout.a() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.l
            @Override // com.crrepa.band.my.device.watchfacenew.photo.widgets.DraggableLinearLayout.a
            public final void onActionUp(int i8, int i9) {
                s.this.lambda$initViewListener$4(i8, i9);
            }
        });
        this.previewBinding.includeLabel1.dragLayout.setDragListener(new DraggableLinearLayout.a() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.m
            @Override // com.crrepa.band.my.device.watchfacenew.photo.widgets.DraggableLinearLayout.a
            public final void onActionUp(int i8, int i9) {
                s.this.lambda$initViewListener$5(i8, i9);
            }
        });
        this.previewBinding.includeLabel2.dragLayout.setDragListener(new DraggableLinearLayout.a() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.n
            @Override // com.crrepa.band.my.device.watchfacenew.photo.widgets.DraggableLinearLayout.a
            public final void onActionUp(int i8, int i9) {
                s.this.lambda$initViewListener$6(i8, i9);
            }
        });
        this.previewBinding.includeLabel3.dragLayout.setDragListener(new DraggableLinearLayout.a() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.o
            @Override // com.crrepa.band.my.device.watchfacenew.photo.widgets.DraggableLinearLayout.a
            public final void onActionUp(int i8, int i9) {
                s.this.lambda$initViewListener$7(i8, i9);
            }
        });
    }

    private void initWheelPicker(final int i8) {
        LinearLayout linearLayout;
        String str;
        String string = com.moyoung.dafit.module.common.utils.d.get().getString(R.string.device_custom_watch_face_jerry_wedget_title);
        if (i8 == 1) {
            linearLayout = this.pointerStyleBinding.includeLabel1.root;
            str = string + "2";
        } else if (i8 == 2) {
            linearLayout = this.pointerStyleBinding.includeLabel2.root;
            str = string + ExifInterface.GPS_MEASUREMENT_3D;
        } else if (i8 == 3) {
            linearLayout = this.pointerStyleBinding.includeLabel3.root;
            str = string + "4";
        } else {
            linearLayout = this.pointerStyleBinding.includeLabel0.root;
            str = string + "1";
        }
        ((TextView) linearLayout.findViewById(R.id.tv_label_title)).setText(str);
        final TextView textView = (TextView) linearLayout.findViewById(R.id.tv_label);
        final String[] labelNameArray = getLabelNameArray();
        int labelType = this.labelPresenter.getLabelType(i8);
        if (labelType < 0 || labelType >= labelNameArray.length) {
            labelType = 0;
        }
        textView.setText(labelNameArray[labelType]);
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((ImageView) linearLayout.findViewById(R.id.iv_label_arrow), "rotation", 0.0f, 90.0f);
        ofFloat.setDuration(300L);
        WheelPicker wheelPicker = (WheelPicker) linearLayout.findViewById(R.id.wp);
        wheelPicker.setData(Arrays.asList(labelNameArray));
        wheelPicker.setSelectedItemPosition(labelType);
        wheelPicker.setOnItemSelectedListener(new WheelPicker.a() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.r
            @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker.a
            public final void onItemSelected(WheelPicker wheelPicker2, Object obj, int i9) {
                s.this.lambda$initWheelPicker$8(i8, labelNameArray, textView, wheelPicker2, obj, i9);
            }
        });
        ViewGroup viewGroup = (ViewGroup) linearLayout.findViewById(R.id.rl_label);
        final ViewGroup viewGroup2 = (ViewGroup) linearLayout.findViewById(R.id.rl_label_wp);
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s.this.lambda$initWheelPicker$9(viewGroup2, ofFloat, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initPointerRv$10(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        ClockPointerBean item = this.pointerStyleAdapter.getItem(i8);
        renderCheckedIndex(item != null ? item.id : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewListener$3(RadioGroup radioGroup, int i8) {
        int i9;
        switch (i8) {
            case R.id.rb_color_black /* 2131363307 */:
                i9 = 1;
                break;
            case R.id.rb_color_blue /* 2131363308 */:
                i9 = 6;
                break;
            case R.id.rb_color_green /* 2131363309 */:
                i9 = 8;
                break;
            case R.id.rb_color_indigo /* 2131363310 */:
                i9 = 7;
                break;
            case R.id.rb_color_origin /* 2131363311 */:
                i9 = 3;
                break;
            case R.id.rb_color_purple /* 2131363312 */:
                i9 = 5;
                break;
            case R.id.rb_color_red /* 2131363313 */:
                i9 = 4;
                break;
            case R.id.rb_color_white /* 2131363314 */:
            default:
                i9 = 0;
                break;
            case R.id.rb_color_yellow /* 2131363315 */:
                i9 = 2;
                break;
        }
        this.labelPresenter.updateLabelTextColor(w1.j.getWatchFaceTextColorInt(i9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewListener$4(int i8, int i9) {
        this.labelPresenter.updateLabelXY(0, i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewListener$5(int i8, int i9) {
        this.labelPresenter.updateLabelXY(1, i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewListener$6(int i8, int i9) {
        this.labelPresenter.updateLabelXY(2, i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewListener$7(int i8, int i9) {
        this.labelPresenter.updateLabelXY(3, i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initWheelPicker$8(int i8, String[] strArr, TextView textView, WheelPicker wheelPicker, Object obj, int i9) {
        this.labelPresenter.updateLabelContent(i8, i9);
        int labelType = this.labelPresenter.getLabelType(i8);
        if (labelType < 0 || labelType >= strArr.length) {
            labelType = 0;
        }
        textView.setText(strArr[labelType]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initWheelPicker$9(ViewGroup viewGroup, ObjectAnimator objectAnimator, View view) {
        if (viewGroup.isShown()) {
            objectAnimator.reverse();
        } else {
            this.pointerStyleBinding.includeLabel0.ivLabelArrow.setRotation(0.0f);
            this.pointerStyleBinding.includeLabel0.rlLabelWp.setVisibility(8);
            this.pointerStyleBinding.includeLabel1.ivLabelArrow.setRotation(0.0f);
            this.pointerStyleBinding.includeLabel1.rlLabelWp.setVisibility(8);
            this.pointerStyleBinding.includeLabel2.ivLabelArrow.setRotation(0.0f);
            this.pointerStyleBinding.includeLabel2.rlLabelWp.setVisibility(8);
            this.pointerStyleBinding.includeLabel3.ivLabelArrow.setRotation(0.0f);
            this.pointerStyleBinding.includeLabel3.rlLabelWp.setVisibility(8);
            objectAnimator.start();
        }
        viewGroup.setVisibility(viewGroup.isShown() ? 8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(LayoutNewWatchFacePointerPreviewBinding layoutNewWatchFacePointerPreviewBinding) {
        requestClockPointerList();
        this.labelPresenter.showPointerLabel(layoutNewWatchFacePointerPreviewBinding.rlPointerLabelRoot.getMeasuredHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestClockPointerList$1(List list) {
        if (x0.isEmpty((List<?>) list)) {
            renderPointerListEmpty();
            Log.d("requestClockPointerList", "2");
            return;
        }
        this.pointerStyleBinding.tvPointStyleTitle.setVisibility(0);
        this.pointerStyleBinding.rvPoint.setVisibility(0);
        this.pointerStyleAdapter.addData((Collection) list);
        this.pointerStyleAdapter.notifyDataSetChanged();
        renderCheckedIndex(this.labelPresenter.getSelectedHandId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestClockPointerList$2(Throwable th) {
        renderPointerListEmpty();
        Log.d("requestClockPointerList", ExifInterface.GPS_MEASUREMENT_3D);
    }

    private void renderCheckedIndex(int i8) {
        this.pointerStyleAdapter.setCheckedHandId(i8);
        this.pointerPreviewDelegate.renderPointerPreviewImg(this.pointerStyleAdapter.getCheckedPointerPreviewFile());
        this.labelPresenter.updateSelectedWatchHandId(i8);
    }

    private void renderPointerListEmpty() {
        this.pointerStyleBinding.tvPointStyleTitle.setVisibility(8);
        this.pointerStyleBinding.rvPoint.setVisibility(8);
    }

    private void requestClockPointerList() {
        Log.d("requestClockPointerList", "1");
        this.disposableList.add(this.clockPointerModel.requestClockPointerList().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                s.this.lambda$requestClockPointerList$1((List) obj);
            }
        }, new Consumer() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                s.this.lambda$requestClockPointerList$2((Throwable) obj);
            }
        }));
    }

    public void destroy() {
        this.disposableList.clear();
    }

    public ClockPointerBean getPointerBean() {
        PointerStyleAdapter pointerStyleAdapter = this.pointerStyleAdapter;
        if (pointerStyleAdapter == null) {
            return null;
        }
        return pointerStyleAdapter.getCheckedPointerBean();
    }

    public int getSelectedHandId() {
        return this.labelPresenter.getSelectedHandId();
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.d
    public void renderColorRadioBtn(int i8) {
        RadioGroup radioGroup = this.pointerStyleBinding.includeColorPicker.rgColor;
        switch (w1.j.getWatchFaceTextARGBColorIndex(i8)) {
            case 0:
                radioGroup.check(R.id.rb_color_white);
                break;
            case 1:
                radioGroup.check(R.id.rb_color_black);
                break;
            case 2:
                radioGroup.check(R.id.rb_color_yellow);
                break;
            case 3:
                radioGroup.check(R.id.rb_color_origin);
                break;
            case 4:
                radioGroup.check(R.id.rb_color_red);
                break;
            case 5:
                radioGroup.check(R.id.rb_color_purple);
                break;
            case 6:
                radioGroup.check(R.id.rb_color_blue);
                break;
            case 7:
                radioGroup.check(R.id.rb_color_indigo);
                break;
            case 8:
                radioGroup.check(R.id.rb_color_green);
                break;
        }
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.d
    public void renderEditState(boolean z7) {
        this.pointerStyleBinding.rvPoint.setEnabled(z7);
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.d, com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.b
    public void renderLabelColor(int i8) {
        this.pointerPreviewDelegate.renderLabelColor(i8);
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.d, com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.b
    public void renderLabelContent(int i8, int i9, int i10) {
        this.pointerPreviewDelegate.renderLabelContent(i8, i9, i10);
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.d, com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.b
    public void renderLabelXY(int i8, int i9, int i10, int i11) {
        this.pointerPreviewDelegate.renderLabelXY(i8, i9, i10, i11);
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.d, com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.b
    public /* bridge */ /* synthetic */ void renderPointerPreviewImg(File file) {
        a.a(this, file);
    }

    public void saveWatchFaceInfo() {
        e.saveSelectedHandId(this.watchFaceType, this.labelPresenter.getSelectedHandId());
        File checkedPointerPreviewFile = this.pointerStyleAdapter.getCheckedPointerPreviewFile();
        if (checkedPointerPreviewFile != null && checkedPointerPreviewFile.exists()) {
            e.saveSelectedPointerPreviewPath(this.watchFaceType, checkedPointerPreviewFile.getAbsolutePath());
        }
        e.saveJieliPhotoWatchFaceInfo(this.watchFaceType, this.labelPresenter.getJieliPhotoWatchFaceInfo());
    }

    public void sendAIWatchFaceLayout() {
        CRPJieliWatchFaceLayoutInfo layoutInfo = this.labelPresenter.getLayoutInfo();
        layoutInfo.setFixedPhotoIndex((byte) 0);
        layoutInfo.setPhotoDisplayMode(CRPPhotoWatchFaceDisplayMode.FIXED);
        layoutInfo.setShowPointer(e.getSelectedHandId(layoutInfo.getWatchFaceType()) != 0);
        e.saveJieliWatchFaceLayoutInfo(this.watchFaceType, layoutInfo);
        i4.getInstance().sendJieliAIWatchFaceLayout(layoutInfo);
        Log.d("AI表盘", "layoutInfo: " + layoutInfo);
    }

    public void sendCustomWatchFaceLayout(CRPPhotoWatchFaceDisplayMode cRPPhotoWatchFaceDisplayMode, int i8) {
        boolean z7 = getPointerBean() != null ? !r0.isNonePointer : false;
        CRPJieliWatchFaceLayoutInfo layoutInfo = this.labelPresenter.getLayoutInfo();
        layoutInfo.setFixedPhotoIndex((byte) i8);
        layoutInfo.setShowPointer(z7);
        layoutInfo.setPhotoDisplayMode(cRPPhotoWatchFaceDisplayMode);
        e.saveJieliWatchFaceLayoutInfo(this.watchFaceType, layoutInfo);
        com.crrepa.band.my.device.watchfacenew.delegate.img.m.saveSentToBandSelectedIndex(i8);
        com.crrepa.band.my.device.watchfacenew.delegate.displaymode.a.savePhotoDisplayMode(cRPPhotoWatchFaceDisplayMode);
        i4.getInstance().sendJieliPhotoWatchFaceLayout(layoutInfo);
        Log.d("相册表盘", "layoutInfo: " + layoutInfo);
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.d, com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.b
    public void showPointerLabel(CRPJieliWatchFaceLayoutInfo cRPJieliWatchFaceLayoutInfo, float f8) {
        this.pointerPreviewDelegate.showPointerLabel(cRPJieliWatchFaceLayoutInfo, f8);
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.d, com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.b
    public void showPointerLabel(CRPJieliWatchFaceLayoutInfo cRPJieliWatchFaceLayoutInfo, int i8, float f8) {
        this.pointerPreviewDelegate.showPointerLabel(cRPJieliWatchFaceLayoutInfo, i8, f8);
    }
}
