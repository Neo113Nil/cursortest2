package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import t2.C5074h;

/* renamed from: com.google.android.gms.internal.ads.Ln, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2662Ln extends FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public final C5074h f26214n;

    public C2662Ln(Context context, View view, C5074h c5074h) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.f26214n = c5074h;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f26214n.a(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof InterfaceC3858rh) {
                arrayList.add((InterfaceC3858rh) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((InterfaceC3858rh) arrayList.get(i4)).destroy();
        }
    }
}
