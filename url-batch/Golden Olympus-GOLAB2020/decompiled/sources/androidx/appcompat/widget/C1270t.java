package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import e.AbstractC2405a;

/* renamed from: androidx.appcompat.widget.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1270t extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    private final C1271u f10967a;

    public C1270t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2405a.f36181H);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f10967a.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f10967a.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f10967a.g(canvas);
    }

    public C1270t(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        V.a(this, getContext());
        C1271u c1271u = new C1271u(this);
        this.f10967a = c1271u;
        c1271u.c(attributeSet, i4);
    }
}
