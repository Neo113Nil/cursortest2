package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public abstract class tn implements oj1<Character> {

    static abstract class a extends tn {
        a() {
        }

        @Override // com.yandex.mobile.ads.impl.oj1
        @Deprecated
        public final boolean apply(Character ch) {
            return a(ch.charValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends a {

        /* renamed from: b, reason: collision with root package name */
        private final char f32512b;

        b(char c4) {
            this.f32512b = c4;
        }

        @Override // com.yandex.mobile.ads.impl.tn
        public final boolean a(char c4) {
            return c4 == this.f32512b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.is('");
            char c4 = this.f32512b;
            char[] cArr = new char[6];
            cArr[0] = '\\';
            cArr[1] = 'u';
            cArr[2] = 0;
            cArr[3] = 0;
            cArr[4] = 0;
            cArr[5] = 0;
            for (int i4 = 0; i4 < 4; i4++) {
                cArr[5 - i4] = "0123456789ABCDEF".charAt(c4 & 15);
                c4 = (char) (c4 >> 4);
            }
            sb.append(String.copyValueOf(cArr));
            sb.append("')");
            return sb.toString();
        }
    }

    static abstract class c extends a {

        /* renamed from: b, reason: collision with root package name */
        private final String f32513b = (String) nj1.a("CharMatcher.none()");

        c() {
        }

        public final String toString() {
            return this.f32513b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class d extends c {

        /* renamed from: c, reason: collision with root package name */
        static final d f32514c = new d();

        private d() {
        }

        @Override // com.yandex.mobile.ads.impl.tn
        public final boolean a(char c4) {
            return false;
        }

        @Override // com.yandex.mobile.ads.impl.tn
        public final int a(CharSequence charSequence, int i4) {
            nj1.b(i4, charSequence.length());
            return -1;
        }
    }

    protected tn() {
    }

    public int a(CharSequence charSequence, int i4) {
        int length = charSequence.length();
        nj1.b(i4, length);
        while (i4 < length) {
            if (a(charSequence.charAt(i4))) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public abstract boolean a(char c4);
}
