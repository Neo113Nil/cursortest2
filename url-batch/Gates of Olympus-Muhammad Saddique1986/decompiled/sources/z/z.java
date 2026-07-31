package z;

import B.a0;
import C0.J;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import m.y0;
import u0.O0;
import x.Q;
import y.AbstractC1230d;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final View f10494a;

    /* renamed from: b, reason: collision with root package name */
    public final C1256t f10495b;

    /* renamed from: e, reason: collision with root package name */
    public Q f10498e;

    /* renamed from: f, reason: collision with root package name */
    public a0 f10499f;

    /* renamed from: g, reason: collision with root package name */
    public O0 f10500g;

    /* renamed from: l, reason: collision with root package name */
    public Rect f10505l;

    /* renamed from: m, reason: collision with root package name */
    public final w f10506m;

    /* renamed from: c, reason: collision with root package name */
    public f2.k f10496c = C1237a.f10429g;

    /* renamed from: d, reason: collision with root package name */
    public f2.k f10497d = C1237a.f10430h;

    /* renamed from: h, reason: collision with root package name */
    public I0.z f10501h = new I0.z("", J.f567b, 4);

    /* renamed from: i, reason: collision with root package name */
    public I0.m f10502i = I0.m.f3071g;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f10503j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final Object f10504k = R1.a.c(R1.g.f4148e, new t0.D(15, this));

    public z(View view, C1239c c1239c, C1256t c1256t) {
        this.f10494a = view;
        this.f10495b = c1256t;
        this.f10506m = new w(c1239c, c1256t);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnectionC1234B a(EditorInfo editorInfo) {
        int i3;
        int i4;
        int i5;
        I0.z zVar = this.f10501h;
        String str = zVar.f3097a.f596a;
        I0.m mVar = this.f10502i;
        int i6 = mVar.f3076e;
        boolean a3 = I0.l.a(i6, 1);
        boolean z3 = mVar.f3072a;
        if (!a3) {
            if (I0.l.a(i6, 0)) {
                i3 = 1;
            } else if (I0.l.a(i6, 2)) {
                i3 = 2;
            } else if (I0.l.a(i6, 6)) {
                i3 = 5;
            } else if (I0.l.a(i6, 5)) {
                i3 = 7;
            } else if (I0.l.a(i6, 3)) {
                i3 = 3;
            } else if (I0.l.a(i6, 4)) {
                i3 = 4;
            } else {
                if (!I0.l.a(i6, 7)) {
                    throw new IllegalStateException("invalid ImeAction");
                }
                i3 = 6;
            }
            editorInfo.imeOptions = i3;
            C1233A.f10416a.a(editorInfo, mVar.f3077f);
            i4 = mVar.f3075d;
            if (!I0.o.a(i4, 1)) {
            }
            i5 = 1;
            editorInfo.inputType = i5;
            if (!z3) {
            }
            if ((editorInfo.inputType & 1) == 1) {
            }
            int i7 = J.f568c;
            long j3 = zVar.f3098b;
            editorInfo.initialSelStart = (int) (j3 >> 32);
            editorInfo.initialSelEnd = (int) (j3 & 4294967295L);
            O2.l.u0(editorInfo, str);
            editorInfo.imeOptions |= 33554432;
            if (AbstractC1230d.f10377a) {
            }
            if (editorInfo.extras == null) {
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
            x xVar = y.f10493a;
            if (m1.i.c()) {
            }
            InputConnectionC1234B inputConnectionC1234B = new InputConnectionC1234B(this.f10501h, new y0(this), this.f10502i.f3074c, this.f10498e, this.f10499f, this.f10500g);
            this.f10503j.add(new WeakReference(inputConnectionC1234B));
            return inputConnectionC1234B;
        }
        if (!z3) {
            i3 = 0;
            editorInfo.imeOptions = i3;
            C1233A.f10416a.a(editorInfo, mVar.f3077f);
            i4 = mVar.f3075d;
            if (!I0.o.a(i4, 1)) {
                if (!I0.o.a(i4, 2)) {
                    if (I0.o.a(i4, 3)) {
                        i5 = 2;
                    } else if (I0.o.a(i4, 4)) {
                        i5 = 3;
                    } else if (I0.o.a(i4, 5)) {
                        i5 = 17;
                    } else if (I0.o.a(i4, 6)) {
                        i5 = 33;
                    } else if (I0.o.a(i4, 7)) {
                        i5 = 129;
                    } else if (I0.o.a(i4, 8)) {
                        i5 = 18;
                    } else {
                        if (!I0.o.a(i4, 9)) {
                            throw new IllegalStateException("Invalid Keyboard Type");
                        }
                        i5 = 8194;
                    }
                    editorInfo.inputType = i5;
                    if (!z3 && (i5 & 1) == 1) {
                        editorInfo.inputType = i5 | 131072;
                        if (I0.l.a(mVar.f3076e, 1)) {
                            editorInfo.imeOptions |= 1073741824;
                        }
                    }
                    if ((editorInfo.inputType & 1) == 1) {
                        int i8 = mVar.f3073b;
                        if (I0.n.a(i8, 1)) {
                            editorInfo.inputType |= 4096;
                        } else if (I0.n.a(i8, 2)) {
                            editorInfo.inputType |= 8192;
                        } else if (I0.n.a(i8, 3)) {
                            editorInfo.inputType |= 16384;
                        }
                        if (mVar.f3074c) {
                            editorInfo.inputType |= 32768;
                        }
                    }
                    int i72 = J.f568c;
                    long j32 = zVar.f3098b;
                    editorInfo.initialSelStart = (int) (j32 >> 32);
                    editorInfo.initialSelEnd = (int) (j32 & 4294967295L);
                    O2.l.u0(editorInfo, str);
                    editorInfo.imeOptions |= 33554432;
                    if (AbstractC1230d.f10377a || I0.o.a(i4, 7) || I0.o.a(i4, 8)) {
                        if (editorInfo.extras == null) {
                            editorInfo.extras = new Bundle();
                        }
                        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
                    } else {
                        if (editorInfo.extras == null) {
                            editorInfo.extras = new Bundle();
                        }
                        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
                        C1250n.f10460a.a(editorInfo);
                    }
                    x xVar2 = y.f10493a;
                    if (m1.i.c()) {
                        m1.i.a().f(editorInfo);
                    }
                    InputConnectionC1234B inputConnectionC1234B2 = new InputConnectionC1234B(this.f10501h, new y0(this), this.f10502i.f3074c, this.f10498e, this.f10499f, this.f10500g);
                    this.f10503j.add(new WeakReference(inputConnectionC1234B2));
                    return inputConnectionC1234B2;
                }
                editorInfo.imeOptions |= Integer.MIN_VALUE;
            }
            i5 = 1;
            editorInfo.inputType = i5;
            if (!z3) {
                editorInfo.inputType = i5 | 131072;
                if (I0.l.a(mVar.f3076e, 1)) {
                }
            }
            if ((editorInfo.inputType & 1) == 1) {
            }
            int i722 = J.f568c;
            long j322 = zVar.f3098b;
            editorInfo.initialSelStart = (int) (j322 >> 32);
            editorInfo.initialSelEnd = (int) (j322 & 4294967295L);
            O2.l.u0(editorInfo, str);
            editorInfo.imeOptions |= 33554432;
            if (AbstractC1230d.f10377a) {
            }
            if (editorInfo.extras == null) {
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
            x xVar22 = y.f10493a;
            if (m1.i.c()) {
            }
            InputConnectionC1234B inputConnectionC1234B22 = new InputConnectionC1234B(this.f10501h, new y0(this), this.f10502i.f3074c, this.f10498e, this.f10499f, this.f10500g);
            this.f10503j.add(new WeakReference(inputConnectionC1234B22));
            return inputConnectionC1234B22;
        }
        i3 = 6;
        editorInfo.imeOptions = i3;
        C1233A.f10416a.a(editorInfo, mVar.f3077f);
        i4 = mVar.f3075d;
        if (!I0.o.a(i4, 1)) {
        }
        i5 = 1;
        editorInfo.inputType = i5;
        if (!z3) {
        }
        if ((editorInfo.inputType & 1) == 1) {
        }
        int i7222 = J.f568c;
        long j3222 = zVar.f3098b;
        editorInfo.initialSelStart = (int) (j3222 >> 32);
        editorInfo.initialSelEnd = (int) (j3222 & 4294967295L);
        O2.l.u0(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (AbstractC1230d.f10377a) {
        }
        if (editorInfo.extras == null) {
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
        x xVar222 = y.f10493a;
        if (m1.i.c()) {
        }
        InputConnectionC1234B inputConnectionC1234B222 = new InputConnectionC1234B(this.f10501h, new y0(this), this.f10502i.f3074c, this.f10498e, this.f10499f, this.f10500g);
        this.f10503j.add(new WeakReference(inputConnectionC1234B222));
        return inputConnectionC1234B222;
    }
}
