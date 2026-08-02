package io.flutter.plugin.platform;

import I.C0079n;
import P.O;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.AssetFileDescriptor;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import d0.ViewOnAttachStateChangeListenerC0180h;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import m0.AbstractActivityC0264d;
import r0.C0289a;

/* loaded from: classes.dex */
public final class n implements h {

    /* renamed from: a, reason: collision with root package name */
    public Object f2653a;

    public /* synthetic */ n(Object obj) {
        this.f2653a = obj;
    }

    @Override // io.flutter.plugin.platform.h
    public long a() {
        return ((TextureRegistry$SurfaceProducer) this.f2653a).id();
    }

    @Override // io.flutter.plugin.platform.h
    public void b(int i2, int i3) {
        ((TextureRegistry$SurfaceProducer) this.f2653a).setSize(i2, i3);
    }

    public void c(int i2) {
        View view;
        o oVar = (o) this.f2653a;
        if (oVar.m(i2)) {
            view = ((A) oVar.f2663i.get(Integer.valueOf(i2))).a();
        } else {
            g gVar = (g) oVar.f2665k.get(i2);
            if (gVar == null) {
                Log.e("PlatformViewsController", "Clearing focus on an unknown view with id: " + i2);
                return;
            }
            view = gVar.getView();
        }
        if (view != null) {
            view.clearFocus();
            return;
        }
        Log.e("PlatformViewsController", "Clearing focus on a null view with id: " + i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if (a.AbstractC0132a.P(r8, new C0.f(6, io.flutter.plugin.platform.o.f2654w)) == false) goto L34;
     */
    /* JADX WARN: Type inference failed for: r14v0, types: [io.flutter.plugin.platform.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long d(final v0.f fVar) {
        j jVar;
        long j2;
        Canvas lockHardwareCanvas;
        final int i2 = 1;
        final o oVar = (o) this.f2653a;
        o.a(oVar, fVar);
        SparseArray sparseArray = oVar.f2668n;
        int i3 = fVar.f3486a;
        if (sparseArray.get(i3) != null) {
            throw new IllegalStateException("Trying to create an already created platform view, view id: " + i3);
        }
        if (oVar.f2659e == null) {
            throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i3);
        }
        if (oVar.f2658d == null) {
            throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i3);
        }
        g b2 = oVar.b(fVar, true);
        View view = b2.getView();
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        int i4 = Build.VERSION.SDK_INT;
        double d2 = fVar.f3489d;
        double d3 = fVar.f3488c;
        if (i4 >= 23) {
        }
        if (fVar.f3493h == 2) {
            o.d(19);
            return -2L;
        }
        if (!oVar.f2675u) {
            o.d(20);
            h i5 = o.i(oVar.f2659e);
            int l2 = oVar.l(d3);
            int l3 = oVar.l(d2);
            Activity activity = oVar.f2657c;
            ?? r14 = new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.l
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z2) {
                    switch (i2) {
                        case 0:
                            v0.f fVar2 = fVar;
                            o oVar2 = oVar;
                            int i6 = fVar2.f3486a;
                            if (!z2) {
                                io.flutter.plugin.editing.j jVar2 = oVar2.f2660f;
                                if (jVar2 != null) {
                                    jVar2.b(i6);
                                    break;
                                }
                            } else {
                                C0079n c0079n = (C0079n) oVar2.f2661g.f875f;
                                if (c0079n != null) {
                                    c0079n.f("viewFocused", Integer.valueOf(i6), null);
                                    break;
                                }
                            }
                            break;
                        default:
                            o oVar3 = oVar;
                            if (!z2) {
                                oVar3.getClass();
                                break;
                            } else {
                                O o2 = oVar3.f2661g;
                                v0.f fVar3 = fVar;
                                C0079n c0079n2 = (C0079n) o2.f875f;
                                if (c0079n2 != null) {
                                    c0079n2.f("viewFocused", Integer.valueOf(fVar3.f3486a), null);
                                    break;
                                }
                            }
                            break;
                    }
                }
            };
            x xVar = A.f2611i;
            A a2 = null;
            if (l2 != 0 && l3 != 0) {
                DisplayManager displayManager = (DisplayManager) activity.getSystemService("display");
                DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
                i5.b(l2, l3);
                StringBuilder sb = new StringBuilder("flutter-vd#");
                int i6 = fVar.f3486a;
                sb.append(i6);
                VirtualDisplay createVirtualDisplay = displayManager.createVirtualDisplay(sb.toString(), l2, l3, displayMetrics.densityDpi, i5.getSurface(), 0, A.f2611i, null);
                if (createVirtualDisplay != null) {
                    a2 = new A(activity, oVar.f2662h, createVirtualDisplay, b2, i5, r14, i6);
                }
            }
            if (a2 != null) {
                oVar.f2663i.put(Integer.valueOf(i3), a2);
                View view2 = b2.getView();
                oVar.f2664j.put(view2.getContext(), view2);
                return i5.a();
            }
            throw new IllegalStateException("Failed creating virtual display for a " + fVar.f3487b + " with id: " + i3);
        }
        o.d(23);
        int l4 = oVar.l(d3);
        int l5 = oVar.l(d2);
        if (oVar.f2675u) {
            jVar = new j(oVar.f2657c);
            j2 = -1;
        } else {
            h i7 = o.i(oVar.f2659e);
            j jVar2 = new j(oVar.f2657c);
            jVar2.f2642j = i7;
            Surface surface = i7.getSurface();
            if (surface != null) {
                lockHardwareCanvas = surface.lockHardwareCanvas();
                try {
                    lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                } finally {
                    surface.unlockCanvasAndPost(lockHardwareCanvas);
                }
            }
            long a3 = i7.a();
            jVar = jVar2;
            j2 = a3;
        }
        jVar.setTouchProcessor(oVar.f2656b);
        h hVar = jVar.f2642j;
        if (hVar != null) {
            hVar.b(l4, l5);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(l4, l5);
        int l6 = oVar.l(fVar.f3490e);
        int l7 = oVar.l(fVar.f3491f);
        layoutParams.topMargin = l6;
        layoutParams.leftMargin = l7;
        jVar.setLayoutParams(layoutParams);
        View view3 = b2.getView();
        view3.setLayoutParams(new FrameLayout.LayoutParams(l4, l5));
        view3.setImportantForAccessibility(4);
        jVar.addView(view3);
        final int i8 = 0;
        jVar.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.l
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view22, boolean z2) {
                switch (i8) {
                    case 0:
                        v0.f fVar2 = fVar;
                        o oVar2 = oVar;
                        int i62 = fVar2.f3486a;
                        if (!z2) {
                            io.flutter.plugin.editing.j jVar22 = oVar2.f2660f;
                            if (jVar22 != null) {
                                jVar22.b(i62);
                                break;
                            }
                        } else {
                            C0079n c0079n = (C0079n) oVar2.f2661g.f875f;
                            if (c0079n != null) {
                                c0079n.f("viewFocused", Integer.valueOf(i62), null);
                                break;
                            }
                        }
                        break;
                    default:
                        o oVar3 = oVar;
                        if (!z2) {
                            oVar3.getClass();
                            break;
                        } else {
                            O o2 = oVar3.f2661g;
                            v0.f fVar3 = fVar;
                            C0079n c0079n2 = (C0079n) o2.f875f;
                            if (c0079n2 != null) {
                                c0079n2.f("viewFocused", Integer.valueOf(fVar3.f3486a), null);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        oVar.f2658d.addView(jVar);
        sparseArray.append(i3, jVar);
        return j2;
    }

    public void e(int i2) {
        i iVar;
        i iVar2;
        o oVar = (o) this.f2653a;
        g gVar = (g) oVar.f2665k.get(i2);
        if (gVar == null) {
            Log.e("PlatformViewsController", "Disposing unknown platform view with id: " + i2);
            return;
        }
        if (gVar.getView() != null) {
            View view = gVar.getView();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        oVar.f2665k.remove(i2);
        if (oVar.m(i2)) {
            HashMap hashMap = oVar.f2663i;
            A a2 = (A) hashMap.get(Integer.valueOf(i2));
            View a3 = a2.a();
            if (a3 != null) {
                oVar.f2664j.remove(a3.getContext());
            }
            a2.f2612a.cancel();
            a2.f2612a.detachState();
            a2.f2619h.release();
            a2.f2617f.release();
            hashMap.remove(Integer.valueOf(i2));
            return;
        }
        SparseArray sparseArray = oVar.f2668n;
        j jVar = (j) sparseArray.get(i2);
        if (jVar != null) {
            jVar.removeAllViews();
            h hVar = jVar.f2642j;
            if (hVar != null) {
                hVar.release();
                jVar.f2642j = null;
            }
            ViewTreeObserver viewTreeObserver = jVar.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (iVar2 = jVar.f2643k) != null) {
                jVar.f2643k = null;
                viewTreeObserver.removeOnGlobalFocusChangeListener(iVar2);
            }
            ViewGroup viewGroup2 = (ViewGroup) jVar.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(jVar);
            }
            sparseArray.remove(i2);
            return;
        }
        SparseArray sparseArray2 = oVar.f2666l;
        C0289a c0289a = (C0289a) sparseArray2.get(i2);
        if (c0289a != null) {
            c0289a.removeAllViews();
            ViewTreeObserver viewTreeObserver2 = c0289a.getViewTreeObserver();
            if (viewTreeObserver2.isAlive() && (iVar = c0289a.f3393l) != null) {
                c0289a.f3393l = null;
                viewTreeObserver2.removeOnGlobalFocusChangeListener(iVar);
            }
            ViewGroup viewGroup3 = (ViewGroup) c0289a.getParent();
            if (viewGroup3 != null) {
                viewGroup3.removeView(c0289a);
            }
            sparseArray2.remove(i2);
        }
    }

    public CharSequence f(v0.d dVar) {
        AbstractActivityC0264d abstractActivityC0264d = ((f) this.f2653a).f2629a;
        ClipboardManager clipboardManager = (ClipboardManager) abstractActivityC0264d.getSystemService("clipboard");
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
                if (dVar != null && dVar != v0.d.f3480e) {
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
                            AssetFileDescriptor openTypedAssetFileDescriptor = abstractActivityC0264d.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                            CharSequence coerceToText = itemAt.coerceToText(abstractActivityC0264d);
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

    public void g(int i2, double d2, double d3) {
        o oVar = (o) this.f2653a;
        if (oVar.m(i2)) {
            return;
        }
        j jVar = (j) oVar.f2668n.get(i2);
        if (jVar == null) {
            Log.e("PlatformViewsController", "Setting offset for unknown platform view with id: " + i2);
        } else {
            int l2 = oVar.l(d2);
            int l3 = oVar.l(d3);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jVar.getLayoutParams();
            layoutParams.topMargin = l2;
            layoutParams.leftMargin = l3;
            jVar.setLayoutParams(layoutParams);
        }
    }

    @Override // io.flutter.plugin.platform.h
    public int getHeight() {
        return ((TextureRegistry$SurfaceProducer) this.f2653a).getHeight();
    }

    @Override // io.flutter.plugin.platform.h
    public Surface getSurface() {
        return ((TextureRegistry$SurfaceProducer) this.f2653a).getSurface();
    }

    @Override // io.flutter.plugin.platform.h
    public int getWidth() {
        return ((TextureRegistry$SurfaceProducer) this.f2653a).getWidth();
    }

    public void h(v0.h hVar) {
        o oVar = (o) this.f2653a;
        float f2 = oVar.f2657c.getResources().getDisplayMetrics().density;
        int i2 = hVar.f3498a;
        if (oVar.m(i2)) {
            A a2 = (A) oVar.f2663i.get(Integer.valueOf(i2));
            MotionEvent k2 = oVar.k(f2, hVar, true);
            SingleViewPresentation singleViewPresentation = a2.f2612a;
            if (singleViewPresentation == null) {
                return;
            }
            singleViewPresentation.dispatchTouchEvent(k2);
            return;
        }
        g gVar = (g) oVar.f2665k.get(i2);
        if (gVar == null) {
            Log.e("PlatformViewsController", "Sending touch to an unknown view with id: " + i2);
            return;
        }
        View view = gVar.getView();
        if (view != null) {
            view.dispatchTouchEvent(oVar.k(f2, hVar, false));
            return;
        }
        Log.e("PlatformViewsController", "Sending touch to a null view with id: " + i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [io.flutter.plugin.platform.m, java.lang.Runnable] */
    public void i(v0.g gVar, final C0.f fVar) {
        h hVar;
        o oVar = (o) this.f2653a;
        int l2 = oVar.l(gVar.f3496b);
        int l3 = oVar.l(gVar.f3497c);
        int i2 = gVar.f3495a;
        if (!oVar.m(i2)) {
            g gVar2 = (g) oVar.f2665k.get(i2);
            j jVar = (j) oVar.f2668n.get(i2);
            if (gVar2 == null || jVar == null) {
                Log.e("PlatformViewsController", "Resizing unknown platform view with id: " + i2);
                return;
            }
            if ((l2 > jVar.getRenderTargetWidth() || l3 > jVar.getRenderTargetHeight()) && (hVar = jVar.f2642j) != null) {
                hVar.b(l2, l3);
            }
            ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
            layoutParams.width = l2;
            layoutParams.height = l3;
            jVar.setLayoutParams(layoutParams);
            View view = gVar2.getView();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = l2;
                layoutParams2.height = l3;
                view.setLayoutParams(layoutParams2);
            }
            int round = (int) Math.round(jVar.getRenderTargetWidth() / oVar.f());
            int round2 = (int) Math.round(jVar.getRenderTargetHeight() / oVar.f());
            v0.i iVar = (v0.i) fVar.f227f;
            HashMap hashMap = new HashMap();
            hashMap.put("width", Double.valueOf(round));
            hashMap.put("height", Double.valueOf(round2));
            iVar.c(hashMap);
            return;
        }
        final float f2 = oVar.f();
        final A a2 = (A) oVar.f2663i.get(Integer.valueOf(i2));
        io.flutter.plugin.editing.j jVar2 = oVar.f2660f;
        if (jVar2 != null) {
            if (jVar2.f2600e.f48b == 3) {
                jVar2.f2610o = true;
            }
            SingleViewPresentation singleViewPresentation = a2.f2612a;
            if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
                a2.f2612a.getView().getClass();
            }
        }
        ?? r3 = new Runnable() { // from class: io.flutter.plugin.platform.m
            @Override // java.lang.Runnable
            public final void run() {
                o oVar2 = (o) n.this.f2653a;
                io.flutter.plugin.editing.j jVar3 = oVar2.f2660f;
                A a3 = a2;
                if (jVar3 != null) {
                    if (jVar3.f2600e.f48b == 3) {
                        jVar3.f2610o = false;
                    }
                    SingleViewPresentation singleViewPresentation2 = a3.f2612a;
                    if (singleViewPresentation2 != null && singleViewPresentation2.getView() != null) {
                        a3.f2612a.getView().getClass();
                    }
                }
                double f3 = oVar2.f2657c == null ? f2 : oVar2.f();
                int round3 = (int) Math.round(a3.f2617f.getWidth() / f3);
                int round4 = (int) Math.round(a3.f2617f.getHeight() / f3);
                v0.i iVar2 = (v0.i) fVar.f227f;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("width", Double.valueOf(round3));
                hashMap2.put("height", Double.valueOf(round4));
                iVar2.c(hashMap2);
            }
        };
        int width = a2.f2617f.getWidth();
        h hVar2 = a2.f2617f;
        if (l2 == width && l3 == hVar2.getHeight()) {
            a2.a().postDelayed(r3, 0L);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            View a3 = a2.a();
            hVar2.b(l2, l3);
            a2.f2619h.resize(l2, l3, a2.f2615d);
            a2.f2619h.setSurface(hVar2.getSurface());
            a3.postDelayed(r3, 0L);
            return;
        }
        boolean isFocused = a2.a().isFocused();
        t detachState = a2.f2612a.detachState();
        a2.f2619h.setSurface(null);
        a2.f2619h.release();
        DisplayManager displayManager = (DisplayManager) a2.f2613b.getSystemService("display");
        hVar2.b(l2, l3);
        a2.f2619h = displayManager.createVirtualDisplay("flutter-vd#" + a2.f2616e, l2, l3, a2.f2615d, hVar2.getSurface(), 0, A.f2611i, null);
        View a4 = a2.a();
        a4.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0180h(a4, (m) r3));
        SingleViewPresentation singleViewPresentation2 = new SingleViewPresentation(a2.f2613b, a2.f2619h.getDisplay(), a2.f2614c, detachState, a2.f2618g, isFocused);
        singleViewPresentation2.show();
        a2.f2612a.cancel();
        a2.f2612a = singleViewPresentation2;
    }

    public void j(int i2, int i3) {
        View view;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalStateException("Trying to set unknown direction value: " + i3 + "(view id: " + i2 + ")");
        }
        o oVar = (o) this.f2653a;
        if (oVar.m(i2)) {
            view = ((A) oVar.f2663i.get(Integer.valueOf(i2))).a();
        } else {
            g gVar = (g) oVar.f2665k.get(i2);
            if (gVar == null) {
                Log.e("PlatformViewsController", "Setting direction to an unknown view with id: " + i2);
                return;
            }
            view = gVar.getView();
        }
        if (view != null) {
            view.setLayoutDirection(i3);
            return;
        }
        Log.e("PlatformViewsController", "Setting direction to a null view with id: " + i2);
    }

    public void k(ArrayList arrayList) {
        f fVar = (f) this.f2653a;
        fVar.getClass();
        int i2 = arrayList.size() == 0 ? 5894 : 1798;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            int ordinal = ((v0.e) arrayList.get(i3)).ordinal();
            if (ordinal == 0) {
                i2 &= -5;
            } else if (ordinal == 1) {
                i2 &= -515;
            }
        }
        fVar.f2633e = i2;
        fVar.b();
    }

    public void l(int i2) {
        View decorView = ((f) this.f2653a).f2629a.getWindow().getDecorView();
        int b2 = K.j.b(i2);
        if (b2 == 0) {
            decorView.performHapticFeedback(0);
            return;
        }
        if (b2 == 1) {
            decorView.performHapticFeedback(1);
            return;
        }
        if (b2 == 2) {
            decorView.performHapticFeedback(3);
            return;
        }
        if (b2 != 3) {
            if (b2 != 4) {
                return;
            }
            decorView.performHapticFeedback(4);
        } else if (Build.VERSION.SDK_INT >= 23) {
            decorView.performHapticFeedback(6);
        }
    }

    @Override // io.flutter.plugin.platform.h
    public void release() {
        ((TextureRegistry$SurfaceProducer) this.f2653a).release();
        this.f2653a = null;
    }

    @Override // io.flutter.plugin.platform.h
    public void scheduleFrame() {
        ((TextureRegistry$SurfaceProducer) this.f2653a).scheduleFrame();
    }
}
