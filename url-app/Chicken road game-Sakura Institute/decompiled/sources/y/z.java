package y;

import A.a0;
import A0.K;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import f1.C0607a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import s.C1093I;
import s0.P0;
import w.P;
import x.AbstractC1298d;
import y2.C1336k;
import y2.EnumC1337l;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final View f11522a;

    /* renamed from: b, reason: collision with root package name */
    public final t f11523b;

    /* renamed from: e, reason: collision with root package name */
    public P f11526e;

    /* renamed from: f, reason: collision with root package name */
    public a0 f11527f;

    /* renamed from: g, reason: collision with root package name */
    public P0 f11528g;

    /* renamed from: l, reason: collision with root package name */
    public Rect f11533l;

    /* renamed from: m, reason: collision with root package name */
    public final w f11534m;

    /* renamed from: c, reason: collision with root package name */
    public M2.p f11524c = C1311a.f11457i;

    /* renamed from: d, reason: collision with root package name */
    public M2.p f11525d = C1311a.f11458j;

    /* renamed from: h, reason: collision with root package name */
    public G0.y f11529h = new G0.y(4, K.f299b, "");

    /* renamed from: i, reason: collision with root package name */
    public G0.m f11530i = G0.m.f3067g;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f11531j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final Object f11532k = C1336k.b(EnumC1337l.f11671e, new C1093I(10, this));

    public z(View view, C1313c c1313c, t tVar) {
        this.f11522a = view;
        this.f11523b = tVar;
        this.f11534m = new w(c1313c, tVar);
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
    public final InputConnectionC1308B a(EditorInfo editorInfo) {
        int i2;
        int i4;
        int i5;
        G0.y yVar = this.f11529h;
        String str = yVar.f3093a.f328a;
        G0.m mVar = this.f11530i;
        int i6 = mVar.f3072e;
        boolean a4 = G0.l.a(i6, 1);
        boolean z4 = mVar.f3068a;
        if (!a4) {
            if (G0.l.a(i6, 0)) {
                i2 = 1;
            } else if (G0.l.a(i6, 2)) {
                i2 = 2;
            } else if (G0.l.a(i6, 6)) {
                i2 = 5;
            } else if (G0.l.a(i6, 5)) {
                i2 = 7;
            } else if (G0.l.a(i6, 3)) {
                i2 = 3;
            } else if (G0.l.a(i6, 4)) {
                i2 = 4;
            } else {
                if (!G0.l.a(i6, 7)) {
                    throw new IllegalStateException("invalid ImeAction");
                }
                i2 = 6;
            }
            editorInfo.imeOptions = i2;
            C1307A.f11444a.a(editorInfo, mVar.f3073f);
            i4 = mVar.f3071d;
            if (!G0.o.a(i4, 1)) {
            }
            i5 = 1;
            editorInfo.inputType = i5;
            if (!z4) {
            }
            if ((editorInfo.inputType & 1) == 1) {
            }
            int i7 = K.f300c;
            long j4 = yVar.f3094b;
            editorInfo.initialSelStart = (int) (j4 >> 32);
            editorInfo.initialSelEnd = (int) (j4 & 4294967295L);
            j0.c.O(editorInfo, str);
            editorInfo.imeOptions |= 33554432;
            if (AbstractC1298d.f11401a) {
            }
            if (editorInfo.extras == null) {
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
            x xVar = y.f11521a;
            if (k1.h.c()) {
            }
            InputConnectionC1308B inputConnectionC1308B = new InputConnectionC1308B(this.f11529h, new C0607a(20, this), this.f11530i.f3070c, this.f11526e, this.f11527f, this.f11528g);
            this.f11531j.add(new WeakReference(inputConnectionC1308B));
            return inputConnectionC1308B;
        }
        if (!z4) {
            i2 = 0;
            editorInfo.imeOptions = i2;
            C1307A.f11444a.a(editorInfo, mVar.f3073f);
            i4 = mVar.f3071d;
            if (!G0.o.a(i4, 1)) {
                if (!G0.o.a(i4, 2)) {
                    if (G0.o.a(i4, 3)) {
                        i5 = 2;
                    } else if (G0.o.a(i4, 4)) {
                        i5 = 3;
                    } else if (G0.o.a(i4, 5)) {
                        i5 = 17;
                    } else if (G0.o.a(i4, 6)) {
                        i5 = 33;
                    } else if (G0.o.a(i4, 7)) {
                        i5 = 129;
                    } else if (G0.o.a(i4, 8)) {
                        i5 = 18;
                    } else {
                        if (!G0.o.a(i4, 9)) {
                            throw new IllegalStateException("Invalid Keyboard Type");
                        }
                        i5 = 8194;
                    }
                    editorInfo.inputType = i5;
                    if (!z4 && (i5 & 1) == 1) {
                        editorInfo.inputType = i5 | 131072;
                        if (G0.l.a(mVar.f3072e, 1)) {
                            editorInfo.imeOptions |= 1073741824;
                        }
                    }
                    if ((editorInfo.inputType & 1) == 1) {
                        int i8 = mVar.f3069b;
                        if (G0.n.a(i8, 1)) {
                            editorInfo.inputType |= 4096;
                        } else if (G0.n.a(i8, 2)) {
                            editorInfo.inputType |= 8192;
                        } else if (G0.n.a(i8, 3)) {
                            editorInfo.inputType |= 16384;
                        }
                        if (mVar.f3070c) {
                            editorInfo.inputType |= 32768;
                        }
                    }
                    int i72 = K.f300c;
                    long j42 = yVar.f3094b;
                    editorInfo.initialSelStart = (int) (j42 >> 32);
                    editorInfo.initialSelEnd = (int) (j42 & 4294967295L);
                    j0.c.O(editorInfo, str);
                    editorInfo.imeOptions |= 33554432;
                    if (AbstractC1298d.f11401a || G0.o.a(i4, 7) || G0.o.a(i4, 8)) {
                        if (editorInfo.extras == null) {
                            editorInfo.extras = new Bundle();
                        }
                        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
                    } else {
                        if (editorInfo.extras == null) {
                            editorInfo.extras = new Bundle();
                        }
                        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
                        o.f11490a.a(editorInfo);
                    }
                    x xVar2 = y.f11521a;
                    if (k1.h.c()) {
                        k1.h.a().f(editorInfo);
                    }
                    InputConnectionC1308B inputConnectionC1308B2 = new InputConnectionC1308B(this.f11529h, new C0607a(20, this), this.f11530i.f3070c, this.f11526e, this.f11527f, this.f11528g);
                    this.f11531j.add(new WeakReference(inputConnectionC1308B2));
                    return inputConnectionC1308B2;
                }
                editorInfo.imeOptions |= Integer.MIN_VALUE;
            }
            i5 = 1;
            editorInfo.inputType = i5;
            if (!z4) {
                editorInfo.inputType = i5 | 131072;
                if (G0.l.a(mVar.f3072e, 1)) {
                }
            }
            if ((editorInfo.inputType & 1) == 1) {
            }
            int i722 = K.f300c;
            long j422 = yVar.f3094b;
            editorInfo.initialSelStart = (int) (j422 >> 32);
            editorInfo.initialSelEnd = (int) (j422 & 4294967295L);
            j0.c.O(editorInfo, str);
            editorInfo.imeOptions |= 33554432;
            if (AbstractC1298d.f11401a) {
            }
            if (editorInfo.extras == null) {
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
            x xVar22 = y.f11521a;
            if (k1.h.c()) {
            }
            InputConnectionC1308B inputConnectionC1308B22 = new InputConnectionC1308B(this.f11529h, new C0607a(20, this), this.f11530i.f3070c, this.f11526e, this.f11527f, this.f11528g);
            this.f11531j.add(new WeakReference(inputConnectionC1308B22));
            return inputConnectionC1308B22;
        }
        i2 = 6;
        editorInfo.imeOptions = i2;
        C1307A.f11444a.a(editorInfo, mVar.f3073f);
        i4 = mVar.f3071d;
        if (!G0.o.a(i4, 1)) {
        }
        i5 = 1;
        editorInfo.inputType = i5;
        if (!z4) {
        }
        if ((editorInfo.inputType & 1) == 1) {
        }
        int i7222 = K.f300c;
        long j4222 = yVar.f3094b;
        editorInfo.initialSelStart = (int) (j4222 >> 32);
        editorInfo.initialSelEnd = (int) (j4222 & 4294967295L);
        j0.c.O(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (AbstractC1298d.f11401a) {
        }
        if (editorInfo.extras == null) {
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
        x xVar222 = y.f11521a;
        if (k1.h.c()) {
        }
        InputConnectionC1308B inputConnectionC1308B222 = new InputConnectionC1308B(this.f11529h, new C0607a(20, this), this.f11530i.f3070c, this.f11526e, this.f11527f, this.f11528g);
        this.f11531j.add(new WeakReference(inputConnectionC1308B222));
        return inputConnectionC1308B222;
    }
}
