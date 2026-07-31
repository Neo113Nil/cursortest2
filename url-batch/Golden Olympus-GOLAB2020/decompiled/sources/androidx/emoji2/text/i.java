package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.f;
import androidx.emoji2.text.n;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    private final f.j f12168a;

    /* renamed from: b, reason: collision with root package name */
    private final n f12169b;

    /* renamed from: c, reason: collision with root package name */
    private f.e f12170c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f12171d;

    /* renamed from: e, reason: collision with root package name */
    private final int[] f12172e;

    private static final class a {
        static int a(CharSequence charSequence, int i4, int i5) {
            int length = charSequence.length();
            if (i4 < 0 || length < i4 || i5 < 0) {
                return -1;
            }
            while (true) {
                boolean z4 = false;
                while (i5 != 0) {
                    i4--;
                    if (i4 < 0) {
                        return z4 ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i4);
                    if (z4) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i5--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i5--;
                    } else {
                        if (Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        z4 = true;
                    }
                }
                return i4;
            }
        }

        static int b(CharSequence charSequence, int i4, int i5) {
            int length = charSequence.length();
            if (i4 < 0 || length < i4 || i5 < 0) {
                return -1;
            }
            while (true) {
                boolean z4 = false;
                while (i5 != 0) {
                    if (i4 >= length) {
                        if (z4) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i4);
                    if (z4) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i5--;
                        i4++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i5--;
                        i4++;
                    } else {
                        if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i4++;
                        z4 = true;
                    }
                }
                return i4;
            }
        }
    }

    private static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public r f12173a;

        /* renamed from: b, reason: collision with root package name */
        private final f.j f12174b;

        b(r rVar, f.j jVar) {
            this.f12173a = rVar;
            this.f12174b = jVar;
        }

        @Override // androidx.emoji2.text.i.c
        public boolean b(CharSequence charSequence, int i4, int i5, p pVar) {
            if (pVar.k()) {
                return true;
            }
            if (this.f12173a == null) {
                this.f12173a = new r(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f12173a.setSpan(this.f12174b.a(pVar), i4, i5, 33);
            return true;
        }

        @Override // androidx.emoji2.text.i.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public r a() {
            return this.f12173a;
        }
    }

    private interface c {
        Object a();

        boolean b(CharSequence charSequence, int i4, int i5, p pVar);
    }

    private static class d implements c {

        /* renamed from: a, reason: collision with root package name */
        private final String f12175a;

        d(String str) {
            this.f12175a = str;
        }

        @Override // androidx.emoji2.text.i.c
        public boolean b(CharSequence charSequence, int i4, int i5, p pVar) {
            if (!TextUtils.equals(charSequence.subSequence(i4, i5), this.f12175a)) {
                return true;
            }
            pVar.l(true);
            return false;
        }

        @Override // androidx.emoji2.text.i.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d a() {
            return this;
        }
    }

    static final class e {

        /* renamed from: a, reason: collision with root package name */
        private int f12176a = 1;

        /* renamed from: b, reason: collision with root package name */
        private final n.a f12177b;

        /* renamed from: c, reason: collision with root package name */
        private n.a f12178c;

        /* renamed from: d, reason: collision with root package name */
        private n.a f12179d;

        /* renamed from: e, reason: collision with root package name */
        private int f12180e;

        /* renamed from: f, reason: collision with root package name */
        private int f12181f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f12182g;

        /* renamed from: h, reason: collision with root package name */
        private final int[] f12183h;

        e(n.a aVar, boolean z4, int[] iArr) {
            this.f12177b = aVar;
            this.f12178c = aVar;
            this.f12182g = z4;
            this.f12183h = iArr;
        }

        private static boolean d(int i4) {
            return i4 == 65039;
        }

        private static boolean f(int i4) {
            return i4 == 65038;
        }

        private int g() {
            this.f12176a = 1;
            this.f12178c = this.f12177b;
            this.f12181f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f12178c.b().j() || d(this.f12180e)) {
                return true;
            }
            if (this.f12182g) {
                if (this.f12183h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f12183h, this.f12178c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        int a(int i4) {
            n.a a4 = this.f12178c.a(i4);
            int i5 = 2;
            if (this.f12176a != 2) {
                if (a4 == null) {
                    i5 = g();
                } else {
                    this.f12176a = 2;
                    this.f12178c = a4;
                    this.f12181f = 1;
                }
            } else if (a4 != null) {
                this.f12178c = a4;
                this.f12181f++;
            } else if (f(i4)) {
                i5 = g();
            } else if (!d(i4)) {
                if (this.f12178c.b() != null) {
                    i5 = 3;
                    if (this.f12181f != 1) {
                        this.f12179d = this.f12178c;
                        g();
                    } else if (h()) {
                        this.f12179d = this.f12178c;
                        g();
                    } else {
                        i5 = g();
                    }
                } else {
                    i5 = g();
                }
            }
            this.f12180e = i4;
            return i5;
        }

        p b() {
            return this.f12178c.b();
        }

        p c() {
            return this.f12179d.b();
        }

        boolean e() {
            if (this.f12176a != 2 || this.f12178c.b() == null) {
                return false;
            }
            return this.f12181f > 1 || h();
        }
    }

    i(n nVar, f.j jVar, f.e eVar, boolean z4, int[] iArr, Set set) {
        this.f12168a = jVar;
        this.f12169b = nVar;
        this.f12170c = eVar;
        this.f12171d = z4;
        this.f12172e = iArr;
        g(set);
    }

    private static boolean a(Editable editable, KeyEvent keyEvent, boolean z4) {
        j[] jVarArr;
        if (f(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!e(selectionStart, selectionEnd) && (jVarArr = (j[]) editable.getSpans(selectionStart, selectionEnd, j.class)) != null && jVarArr.length > 0) {
            for (j jVar : jVarArr) {
                int spanStart = editable.getSpanStart(jVar);
                int spanEnd = editable.getSpanEnd(jVar);
                if ((z4 && spanStart == selectionStart) || ((!z4 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean b(InputConnection inputConnection, Editable editable, int i4, int i5, boolean z4) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i4 >= 0 && i5 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (e(selectionStart, selectionEnd)) {
                return false;
            }
            if (z4) {
                max = a.a(editable, selectionStart, Math.max(i4, 0));
                min = a.b(editable, selectionEnd, Math.max(i5, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i4, 0);
                min = Math.min(selectionEnd + i5, editable.length());
            }
            j[] jVarArr = (j[]) editable.getSpans(max, min, j.class);
            if (jVarArr != null && jVarArr.length > 0) {
                for (j jVar : jVarArr) {
                    int spanStart = editable.getSpanStart(jVar);
                    int spanEnd = editable.getSpanEnd(jVar);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean c(Editable editable, int i4, KeyEvent keyEvent) {
        if (!(i4 != 67 ? i4 != 112 ? false : a(editable, keyEvent, true) : a(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean d(CharSequence charSequence, int i4, int i5, p pVar) {
        if (pVar.d() == 0) {
            pVar.m(this.f12170c.a(charSequence, i4, i5, pVar.h()));
        }
        return pVar.d() == 2;
    }

    private static boolean e(int i4, int i5) {
        return i4 == -1 || i5 == -1 || i4 != i5;
    }

    private static boolean f(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private void g(Set set) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            i(str, 0, str.length(), 1, true, new d(str));
        }
    }

    private Object i(CharSequence charSequence, int i4, int i5, int i6, boolean z4, c cVar) {
        int i7;
        e eVar = new e(this.f12169b.f(), this.f12171d, this.f12172e);
        int i8 = 0;
        boolean z5 = true;
        int codePointAt = Character.codePointAt(charSequence, i4);
        loop0: while (true) {
            i7 = i4;
            while (i4 < i5 && i8 < i6 && z5) {
                int a4 = eVar.a(codePointAt);
                if (a4 == 1) {
                    i7 += Character.charCount(Character.codePointAt(charSequence, i7));
                    if (i7 < i5) {
                        codePointAt = Character.codePointAt(charSequence, i7);
                    }
                    i4 = i7;
                } else if (a4 == 2) {
                    i4 += Character.charCount(codePointAt);
                    if (i4 < i5) {
                        codePointAt = Character.codePointAt(charSequence, i4);
                    }
                } else if (a4 == 3) {
                    if (z4 || !d(charSequence, i7, i4, eVar.c())) {
                        z5 = cVar.b(charSequence, i7, i4, eVar.c());
                        i8++;
                    }
                }
            }
        }
        if (eVar.e() && i8 < i6 && z5 && (z4 || !d(charSequence, i7, i4, eVar.b()))) {
            cVar.b(charSequence, i7, i4, eVar.b());
        }
        return cVar.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a7, code lost:
    
        if (r1 != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:62:0x000e, B:65:0x0013, B:67:0x0017, B:69:0x0024, B:10:0x003c, B:12:0x0044, B:14:0x0047, B:16:0x004b, B:18:0x0057, B:19:0x005a, B:29:0x0078), top: B:61:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    CharSequence h(CharSequence charSequence, int i4, int i5, int i6, boolean z4) {
        r rVar;
        CharSequence charSequence2;
        Throwable th;
        int i7;
        int i8;
        j[] jVarArr;
        boolean z5 = charSequence instanceof o;
        if (z5) {
            ((o) charSequence).a();
        }
        try {
            if (!z5) {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        rVar = (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i4 + (-1), i5 + 1, j.class) > i5) ? null : new r(charSequence);
                        if (rVar != null && (jVarArr = (j[]) rVar.getSpans(i4, i5, j.class)) != null && jVarArr.length > 0) {
                            for (j jVar : jVarArr) {
                                int spanStart = rVar.getSpanStart(jVar);
                                int spanEnd = rVar.getSpanEnd(jVar);
                                if (spanStart != i5) {
                                    rVar.removeSpan(jVar);
                                }
                                i4 = Math.min(spanStart, i4);
                                i5 = Math.max(spanEnd, i5);
                            }
                        }
                        i7 = i4;
                        i8 = i5;
                        if (i7 != i8 || i7 >= charSequence.length()) {
                            charSequence2 = charSequence;
                            if (!z5) {
                                return charSequence2;
                            }
                        } else {
                            if (i6 != Integer.MAX_VALUE && rVar != null) {
                                i6 -= ((j[]) rVar.getSpans(0, rVar.length(), j.class)).length;
                            }
                            charSequence2 = charSequence;
                            try {
                                r rVar2 = (r) i(charSequence2, i7, i8, i6, z4, new b(rVar, this.f12168a));
                                if (rVar2 != null) {
                                    Spannable b4 = rVar2.b();
                                    if (z5) {
                                        ((o) charSequence2).d();
                                    }
                                    return b4;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                if (!z5) {
                                }
                            }
                        }
                        ((o) charSequence2).d();
                        return charSequence2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    charSequence2 = charSequence;
                    if (!z5) {
                    }
                }
            }
            rVar = new r((Spannable) charSequence);
            if (rVar != null) {
                while (r6 < r5) {
                }
            }
            i7 = i4;
            i8 = i5;
            if (i7 != i8) {
            }
            charSequence2 = charSequence;
            if (!z5) {
            }
            ((o) charSequence2).d();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
            th = th;
            if (!z5) {
                throw th;
            }
            ((o) charSequence2).d();
            throw th;
        }
    }
}
