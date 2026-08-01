package io.flutter.plugin.editing;

import E.AbstractActivityC0004e;
import E.AbstractC0008i;
import E.M;
import E.s;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import androidx.profileinstaller.ProfileInstallReceiver;
import io.flutter.plugin.platform.p;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import m.AbstractC0068d;
import m.InterfaceC0070f;

/* loaded from: classes.dex */
public final class a implements InterfaceC0070f, n0.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f630b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f631c;

    public /* synthetic */ a(int i2, Object obj) {
        this.f630b = i2;
        this.f631c = obj;
    }

    public static boolean i(int i2) {
        return (48 <= i2 && i2 <= 57) || i2 == 35 || i2 == 42;
    }

    @Override // m.InterfaceC0070f
    public void a(int i2, Serializable serializable) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f631c).setResultCode(i2);
    }

    @Override // n0.d
    public Object b(Object obj, Y.b bVar) {
        ((s) this.f631c).accept(obj);
        return U.g.f433a;
    }

    @Override // m.InterfaceC0070f
    public void c() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public void d(int i2) {
        io.flutter.plugin.platform.j jVar = (io.flutter.plugin.platform.j) this.f631c;
        if (jVar.h(i2)) {
            ((p) jVar.f726j.get(Integer.valueOf(i2))).getClass();
            Log.e("PlatformViewsController", "Clearing focus on a null view with id: " + i2);
            return;
        }
        if (jVar.f728l.get(i2) != null) {
            throw new ClassCastException();
        }
        Log.e("PlatformViewsController", "Clearing focus on an unknown view with id: " + i2);
    }

    public void e(M.g gVar) {
        io.flutter.plugin.platform.j jVar = (io.flutter.plugin.platform.j) this.f631c;
        jVar.getClass();
        io.flutter.plugin.platform.j.a(jVar, gVar);
        if (jVar.f721e.IsSurfaceControlEnabled()) {
            throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
        HashMap hashMap = jVar.f718b.f270a;
        String str = gVar.f345b;
        if (hashMap.get(str) != null) {
            throw new ClassCastException();
        }
        throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
    }

    public long f(M.g gVar) {
        io.flutter.plugin.platform.j jVar = (io.flutter.plugin.platform.j) this.f631c;
        io.flutter.plugin.platform.j.a(jVar, gVar);
        SparseArray sparseArray = jVar.f731o;
        int i2 = gVar.f344a;
        if (sparseArray.get(i2) != null) {
            throw new IllegalStateException("Trying to create an already created platform view, view id: " + i2);
        }
        if (jVar.f722f == null) {
            throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i2);
        }
        if (jVar.f720d == null) {
            throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i2);
        }
        HashMap hashMap = jVar.f718b.f270a;
        String str = gVar.f345b;
        if (hashMap.get(str) != null) {
            throw new ClassCastException();
        }
        throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
    }

    public void g(int i2) {
        switch (this.f630b) {
            case 2:
                AbstractC0008i.e(((io.flutter.plugin.platform.j) this.f631c).f728l.get(i2));
                Log.e("PlatformViewsController", "Disposing unknown platform view with id: " + i2);
                break;
            default:
                AbstractC0008i.e(((io.flutter.plugin.platform.i) this.f631c).f711h.get(i2));
                Log.e("PlatformViewsController2", "Disposing unknown platform view with id: " + i2);
                break;
        }
    }

    public CharSequence h(M.e eVar) {
        AbstractActivityC0004e abstractActivityC0004e = ((io.flutter.plugin.platform.e) this.f631c).f700a;
        ClipboardManager clipboardManager = (ClipboardManager) abstractActivityC0004e.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            try {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (eVar != null && eVar != M.e.f337c) {
                    return null;
                }
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                CharSequence text = itemAt.getText();
                if (text != null) {
                    return text;
                }
                try {
                    Uri uri = itemAt.getUri();
                    if (uri == null) {
                        Log.w("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                    } else {
                        String scheme = uri.getScheme();
                        if (scheme.equals("content")) {
                            AssetFileDescriptor openTypedAssetFileDescriptor = abstractActivityC0004e.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                            CharSequence coerceToText = itemAt.coerceToText(abstractActivityC0004e);
                            if (openTypedAssetFileDescriptor != null) {
                                try {
                                    openTypedAssetFileDescriptor.close();
                                } catch (IOException e2) {
                                    charSequence = coerceToText;
                                    e = e2;
                                    Log.w("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                                    return charSequence;
                                }
                            }
                            charSequence = coerceToText;
                        } else {
                            Log.w("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                        }
                    }
                    return charSequence;
                } catch (IOException e3) {
                    e = e3;
                    charSequence = text;
                }
            } catch (IOException e4) {
                e = e4;
            }
        } catch (FileNotFoundException unused) {
            Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
            return null;
        } catch (SecurityException e5) {
            Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e5);
            return null;
        }
    }

    public void j(int i2, double d2, double d3) {
        io.flutter.plugin.platform.j jVar = (io.flutter.plugin.platform.j) this.f631c;
        if (jVar.h(i2)) {
            return;
        }
        Log.e("PlatformViewsController", "Setting offset for unknown platform view with id: " + i2);
    }

    public void k(M.h hVar) {
        PriorityQueue priorityQueue;
        LongSparseArray longSparseArray;
        long j2;
        io.flutter.plugin.platform.j jVar = (io.flutter.plugin.platform.j) this.f631c;
        float f2 = jVar.f719c.getResources().getDisplayMetrics().density;
        int i2 = hVar.f347a;
        if (!jVar.h(i2)) {
            if (jVar.f728l.get(i2) != null) {
                throw new ClassCastException();
            }
            Log.e("PlatformViewsController", "Sending touch to an unknown view with id: " + i2);
            return;
        }
        p pVar = (p) jVar.f726j.get(Integer.valueOf(i2));
        M m2 = new M(hVar.f362p);
        while (true) {
            A.a aVar = jVar.f736u;
            priorityQueue = (PriorityQueue) aVar.f4d;
            boolean isEmpty = priorityQueue.isEmpty();
            longSparseArray = (LongSparseArray) aVar.f3c;
            j2 = m2.f128a;
            if (isEmpty || ((Long) priorityQueue.peek()).longValue() >= j2) {
                break;
            } else {
                longSparseArray.remove(((Long) priorityQueue.poll()).longValue());
            }
        }
        if (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() == j2) {
            priorityQueue.poll();
        }
        longSparseArray.remove(j2);
        List<List> list = (List) hVar.f353g;
        ArrayList arrayList = new ArrayList();
        for (List list2 : list) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
            double d2 = f2;
            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d2);
            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d2);
            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d2);
            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d2);
            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d2);
            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d2);
            arrayList.add(pointerCoords);
        }
        int i3 = hVar.f351e;
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i3]);
        List<List> list3 = (List) hVar.f352f;
        ArrayList arrayList2 = new ArrayList();
        for (List list4 : list3) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ((Integer) list4.get(0)).intValue();
            pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        MotionEvent.obtain(hVar.f348b.longValue(), hVar.f349c.longValue(), hVar.f350d, hVar.f351e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i3]), pointerCoordsArr, hVar.f354h, hVar.f355i, hVar.f356j, hVar.f357k, hVar.f358l, hVar.f359m, hVar.f360n, hVar.f361o);
        pVar.getClass();
    }

    public void l(M.i iVar, F.j jVar) {
        io.flutter.plugin.platform.j jVar2 = (io.flutter.plugin.platform.j) this.f631c;
        int i2 = jVar2.i(iVar.f364b);
        int i3 = jVar2.i(iVar.f365c);
        int i4 = iVar.f363a;
        if (!jVar2.h(i4)) {
            if (jVar2.f728l.get(i4) != null) {
                throw new ClassCastException();
            }
            Log.e("PlatformViewsController", "Resizing unknown platform view with id: " + i4);
            return;
        }
        float f2 = jVar2.f719c.getResources().getDisplayMetrics().density;
        p pVar = (p) jVar2.f726j.get(Integer.valueOf(i4));
        m mVar = jVar2.f723g;
        if (mVar != null) {
            if (mVar.f682e.f676a == 3) {
                mVar.f693p = true;
            }
            pVar.getClass();
        }
        pVar.getClass();
        if (i2 == 0 && i3 == 0) {
            throw null;
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw null;
        }
        throw null;
    }

    public void m(int i2, int i3) {
        if (i3 != 0 && i3 != 1) {
            throw new IllegalStateException("Trying to set unknown direction value: " + i3 + "(view id: " + i2 + ")");
        }
        io.flutter.plugin.platform.j jVar = (io.flutter.plugin.platform.j) this.f631c;
        if (jVar.h(i2)) {
            ((p) jVar.f726j.get(Integer.valueOf(i2))).getClass();
            Log.e("PlatformViewsController", "Setting direction to a null view with id: " + i2);
            return;
        }
        if (jVar.f728l.get(i2) != null) {
            throw new ClassCastException();
        }
        Log.e("PlatformViewsController", "Setting direction to an unknown view with id: " + i2);
    }

    public void n(ArrayList arrayList) {
        io.flutter.plugin.platform.e eVar = (io.flutter.plugin.platform.e) this.f631c;
        eVar.getClass();
        int i2 = arrayList.isEmpty() ? 5894 : 1798;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            int ordinal = ((M.f) arrayList.get(i3)).ordinal();
            if (ordinal == 0) {
                i2 &= -5;
            } else if (ordinal == 1) {
                i2 &= -515;
            }
        }
        eVar.f704e = i2;
        eVar.b();
    }

    public void o(int i2) {
        View decorView = ((io.flutter.plugin.platform.e) this.f631c).f700a.getWindow().getDecorView();
        int a2 = AbstractC0068d.a(i2);
        if (a2 == 0) {
            decorView.performHapticFeedback(0);
            return;
        }
        if (a2 == 1) {
            decorView.performHapticFeedback(1);
            return;
        }
        if (a2 == 2) {
            decorView.performHapticFeedback(3);
        } else if (a2 == 3) {
            decorView.performHapticFeedback(6);
        } else {
            if (a2 != 4) {
                return;
            }
            decorView.performHapticFeedback(4);
        }
    }

    public String toString() {
        switch (this.f630b) {
            case 5:
                return "<" + ((String) this.f631c) + '>';
            default:
                return super.toString();
        }
    }
}
