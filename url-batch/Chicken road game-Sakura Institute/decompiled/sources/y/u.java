package y;

import a0.x0;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import r1.z0;
import s1.l2;
import w.j0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final View f9747a;

    /* renamed from: b, reason: collision with root package name */
    public final p f9748b;

    /* renamed from: e, reason: collision with root package name */
    public j0 f9751e;

    /* renamed from: f, reason: collision with root package name */
    public x0 f9752f;

    /* renamed from: g, reason: collision with root package name */
    public l2 f9753g;

    /* renamed from: l, reason: collision with root package name */
    public Rect f9758l;

    /* renamed from: m, reason: collision with root package name */
    public final r f9759m;

    /* renamed from: c, reason: collision with root package name */
    public r6.l f9749c = a.f9701i;

    /* renamed from: d, reason: collision with root package name */
    public q6.c f9750d = a.f9702j;

    /* renamed from: h, reason: collision with root package name */
    public g2.w f9754h = new g2.w(4, a2.j0.f406b, "");

    /* renamed from: i, reason: collision with root package name */
    public g2.m f9755i = g2.m.f4041g;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f9756j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final Object f9757k = d6.a.c(d6.h.f2616g, new z0(13, this));

    public u(View view, c cVar, p pVar) {
        this.f9747a = view;
        this.f9748b = pVar;
        this.f9759m = new r(cVar, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w a(EditorInfo editorInfo) {
        int i7;
        int i8;
        int i9;
        g2.w wVar = this.f9754h;
        String str = wVar.f4065a.f373f;
        long j8 = wVar.f4066b;
        g2.m mVar = this.f9755i;
        int i10 = mVar.f4046e;
        int i11 = mVar.f4045d;
        boolean z8 = mVar.f4042a;
        if (i10 != 1) {
            if (i10 == 0) {
                i7 = 1;
            } else if (i10 == 2) {
                i7 = 2;
            } else if (i10 == 6) {
                i7 = 5;
            } else if (i10 == 5) {
                i7 = 7;
            } else if (i10 == 3) {
                i7 = 3;
            } else if (i10 == 4) {
                i7 = 4;
            } else {
                if (i10 != 7) {
                    throw new IllegalStateException("invalid ImeAction");
                }
                i7 = 6;
            }
            editorInfo.imeOptions = i7;
            v.f9760a.a(editorInfo, mVar.f4047f);
            if (i11 != 1) {
            }
            i8 = 1;
            editorInfo.inputType = i8;
            if (!z8) {
            }
            i9 = editorInfo.inputType;
            if ((i9 & 1) == 1) {
            }
            int i12 = a2.j0.f407c;
            editorInfo.initialSelStart = (int) (j8 >> 32);
            editorInfo.initialSelEnd = (int) (j8 & 4294967295L);
            a.a.I(editorInfo, str);
            editorInfo.imeOptions |= 33554432;
            if (x.b.f9592a) {
            }
            if (editorInfo.extras == null) {
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
            s sVar = t.f9746a;
            if (l3.k.c()) {
            }
            w wVar2 = new w(this.f9754h, new l1.x(20, this), this.f9755i.f4044c, this.f9751e, this.f9752f, this.f9753g);
            this.f9756j.add(new WeakReference(wVar2));
            return wVar2;
        }
        if (!z8) {
            i7 = 0;
            editorInfo.imeOptions = i7;
            v.f9760a.a(editorInfo, mVar.f4047f);
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        i8 = 2;
                    } else if (i11 == 4) {
                        i8 = 3;
                    } else if (i11 == 5) {
                        i8 = 17;
                    } else if (i11 == 6) {
                        i8 = 33;
                    } else if (i11 == 7) {
                        i8 = 129;
                    } else if (i11 == 8) {
                        i8 = 18;
                    } else {
                        if (i11 != 9) {
                            throw new IllegalStateException("Invalid Keyboard Type");
                        }
                        i8 = 8194;
                    }
                    editorInfo.inputType = i8;
                    if (!z8 && (i8 & 1) == 1) {
                        editorInfo.inputType = 131072 | i8;
                        if (mVar.f4046e == 1) {
                            editorInfo.imeOptions |= 1073741824;
                        }
                    }
                    i9 = editorInfo.inputType;
                    if ((i9 & 1) == 1) {
                        int i13 = mVar.f4043b;
                        if (i13 == 1) {
                            editorInfo.inputType = i9 | 4096;
                        } else if (i13 == 2) {
                            editorInfo.inputType = i9 | 8192;
                        } else if (i13 == 3) {
                            editorInfo.inputType = i9 | 16384;
                        }
                        if (mVar.f4044c) {
                            editorInfo.inputType |= 32768;
                        }
                    }
                    int i122 = a2.j0.f407c;
                    editorInfo.initialSelStart = (int) (j8 >> 32);
                    editorInfo.initialSelEnd = (int) (j8 & 4294967295L);
                    a.a.I(editorInfo, str);
                    editorInfo.imeOptions |= 33554432;
                    if (x.b.f9592a || i11 == 7 || i11 == 8) {
                        if (editorInfo.extras == null) {
                            editorInfo.extras = new Bundle();
                        }
                        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
                    } else {
                        if (editorInfo.extras == null) {
                            editorInfo.extras = new Bundle();
                        }
                        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
                        k.f9719a.a(editorInfo);
                    }
                    s sVar2 = t.f9746a;
                    if (l3.k.c()) {
                        l3.k.a().f(editorInfo);
                    }
                    w wVar22 = new w(this.f9754h, new l1.x(20, this), this.f9755i.f4044c, this.f9751e, this.f9752f, this.f9753g);
                    this.f9756j.add(new WeakReference(wVar22));
                    return wVar22;
                }
                editorInfo.imeOptions |= Integer.MIN_VALUE;
            }
            i8 = 1;
            editorInfo.inputType = i8;
            if (!z8) {
                editorInfo.inputType = 131072 | i8;
                if (mVar.f4046e == 1) {
                }
            }
            i9 = editorInfo.inputType;
            if ((i9 & 1) == 1) {
            }
            int i1222 = a2.j0.f407c;
            editorInfo.initialSelStart = (int) (j8 >> 32);
            editorInfo.initialSelEnd = (int) (j8 & 4294967295L);
            a.a.I(editorInfo, str);
            editorInfo.imeOptions |= 33554432;
            if (x.b.f9592a) {
            }
            if (editorInfo.extras == null) {
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
            s sVar22 = t.f9746a;
            if (l3.k.c()) {
            }
            w wVar222 = new w(this.f9754h, new l1.x(20, this), this.f9755i.f4044c, this.f9751e, this.f9752f, this.f9753g);
            this.f9756j.add(new WeakReference(wVar222));
            return wVar222;
        }
        i7 = 6;
        editorInfo.imeOptions = i7;
        v.f9760a.a(editorInfo, mVar.f4047f);
        if (i11 != 1) {
        }
        i8 = 1;
        editorInfo.inputType = i8;
        if (!z8) {
        }
        i9 = editorInfo.inputType;
        if ((i9 & 1) == 1) {
        }
        int i12222 = a2.j0.f407c;
        editorInfo.initialSelStart = (int) (j8 >> 32);
        editorInfo.initialSelEnd = (int) (j8 & 4294967295L);
        a.a.I(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (x.b.f9592a) {
        }
        if (editorInfo.extras == null) {
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
        s sVar222 = t.f9746a;
        if (l3.k.c()) {
        }
        w wVar2222 = new w(this.f9754h, new l1.x(20, this), this.f9755i.f4044c, this.f9751e, this.f9752f, this.f9753g);
        this.f9756j.add(new WeakReference(wVar2222));
        return wVar2222;
    }
}
