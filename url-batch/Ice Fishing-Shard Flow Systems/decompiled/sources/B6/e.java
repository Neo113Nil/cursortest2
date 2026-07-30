package B6;

import android.view.KeyEvent;
import androidx.appcompat.widget.ActionMenuView;
import i.C0508J;
import kotlin.jvm.internal.Intrinsics;
import m.y;
import n.C0708f;
import n.C0716j;

/* loaded from: classes.dex */
public class e implements y {

    /* renamed from: d, reason: collision with root package name */
    public boolean f219d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f220e;

    public e(p writer) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f220e = writer;
        this.f219d = true;
    }

    @Override // m.y
    public void a(m.m mVar, boolean z7) {
        C0716j c0716j;
        C0508J c0508j = (C0508J) this.f220e;
        if (this.f219d) {
            return;
        }
        this.f219d = true;
        ActionMenuView actionMenuView = c0508j.f5369a.f6886a.f3332d;
        if (actionMenuView != null && (c0716j = actionMenuView.f3196B) != null) {
            c0716j.c();
            C0708f c0708f = c0716j.f6794B;
            if (c0708f != null && c0708f.b()) {
                c0708f.f6484i.dismiss();
            }
        }
        c0508j.f5370b.onPanelClosed(108, mVar);
        this.f219d = false;
    }

    public void b() {
        this.f219d = false;
    }

    public void c(boolean z7) {
        if (this.f219d) {
            throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
        }
        this.f219d = true;
        h4.w wVar = (h4.w) this.f220e;
        int i2 = wVar.f5279b - 1;
        wVar.f5279b = i2;
        boolean z8 = z7 | wVar.f5278a;
        wVar.f5278a = z8;
        if (i2 != 0 || z8) {
            return;
        }
        ((D0.j) wVar.f5281d).S((KeyEvent) wVar.f5280c);
    }

    public void d(byte b7) {
        ((p) this.f220e).j(String.valueOf(b7));
    }

    public void e(char c7) {
        p pVar = (p) this.f220e;
        pVar.c(pVar.f233b, 1);
        char[] cArr = (char[]) pVar.f234c;
        int i2 = pVar.f233b;
        pVar.f233b = i2 + 1;
        cArr[i2] = c7;
    }

    public void f(int i2) {
        ((p) this.f220e).j(String.valueOf(i2));
    }

    public void g(long j) {
        ((p) this.f220e).j(String.valueOf(j));
    }

    public void h(String v7) {
        Intrinsics.checkNotNullParameter(v7, "v");
        ((p) this.f220e).j(v7);
    }

    @Override // m.y
    public boolean i(m.m mVar) {
        ((C0508J) this.f220e).f5370b.onMenuOpened(108, mVar);
        return true;
    }

    public void j(short s7) {
        ((p) this.f220e).j(String.valueOf(s7));
    }

    public void k(String text) {
        int i2;
        Intrinsics.checkNotNullParameter(text, "value");
        p pVar = (p) this.f220e;
        Intrinsics.checkNotNullParameter(text, "text");
        pVar.c(pVar.f233b, text.length() + 2);
        char[] cArr = (char[]) pVar.f234c;
        int i5 = pVar.f233b;
        int i7 = i5 + 1;
        cArr[i5] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i7);
        int i8 = length + i7;
        int i9 = i7;
        while (i9 < i8) {
            char c7 = cArr[i9];
            byte[] bArr = w.f265b;
            if (c7 < bArr.length && bArr[c7] != 0) {
                int length2 = text.length();
                for (int i10 = i9 - i7; i10 < length2; i10++) {
                    pVar.c(i9, 2);
                    char charAt = text.charAt(i10);
                    byte[] bArr2 = w.f265b;
                    if (charAt < bArr2.length) {
                        byte b7 = bArr2[charAt];
                        if (b7 == 0) {
                            i2 = i9 + 1;
                            ((char[]) pVar.f234c)[i9] = charAt;
                        } else {
                            if (b7 == 1) {
                                String str = w.f264a[charAt];
                                Intrinsics.b(str);
                                pVar.c(i9, str.length());
                                str.getChars(0, str.length(), (char[]) pVar.f234c, i9);
                                int length3 = str.length() + i9;
                                pVar.f233b = length3;
                                i9 = length3;
                            } else {
                                char[] cArr2 = (char[]) pVar.f234c;
                                cArr2[i9] = '\\';
                                cArr2[i9 + 1] = (char) b7;
                                i9 += 2;
                                pVar.f233b = i9;
                            }
                        }
                    } else {
                        i2 = i9 + 1;
                        ((char[]) pVar.f234c)[i9] = charAt;
                    }
                    i9 = i2;
                }
                pVar.c(i9, 1);
                ((char[]) pVar.f234c)[i9] = '\"';
                pVar.f233b = i9 + 1;
                return;
            }
            i9++;
        }
        cArr[i8] = '\"';
        pVar.f233b = i8 + 1;
    }

    public e(h4.w wVar) {
        this.f220e = wVar;
        this.f219d = false;
    }

    public e(C0508J c0508j) {
        this.f220e = c0508j;
    }

    public void l() {
    }

    public void m() {
    }
}
