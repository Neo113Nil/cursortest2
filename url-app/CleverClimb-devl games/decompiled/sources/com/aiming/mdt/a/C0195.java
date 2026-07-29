package com.aiming.mdt.a;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import com.tapjoy.TapjoyConstants;
import java.lang.ref.SoftReference;

/* renamed from: com.aiming.mdt.a.ˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0195 {

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    private static int f669 = 0;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static volatile C0195 f670 = null;

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private static int f671 = 163;

    /* renamed from: ʼʽ, reason: contains not printable characters */
    private static int f672 = 1;

    /* renamed from: ʼ, reason: contains not printable characters */
    private SoftReference<Application> f675 = null;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private SoftReference<Handler> f674 = null;

    /* renamed from: ʽ, reason: contains not printable characters */
    private C0131 f676 = null;

    /* renamed from: ʻ, reason: contains not printable characters */
    private C0109 f673 = null;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static C0195 m731() {
        if (f670 == null) {
            synchronized (C0195.class) {
                if (f670 == null) {
                    f670 = new C0195();
                }
            }
        }
        return f670;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static Application m732() {
        int i = f669 + 87;
        f672 = i % 128;
        int i2 = i % 2;
        Application application = null;
        try {
            application = (Application) Class.forName(m734(21, "\u000b\u0000\u0001\u000e\u000b￦\u000f\u000f￠ￍ\u000f\u000f\u0000ￍ\u0003\b\u000e\u0011\u0003\r\u0000\u0012", 260, true, 22).intern()).getMethod(m734(13, "\t\tￚ\u0005\ufffa\u0002\r\u0002\u0007￢\r\ufffe\u0000\u0007\b\u0002\r\ufffa￼\u0002\u0005", 266, true, 21).intern(), new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            m734(32, "\n\u0004\u000f￼\ufffe\u0004\u0007\u000b\u000bￜ\u0007￼\u0004\u000f\u0004\t￤\u000f\u0000\u0002ￕ\u0007\u0004\u000f\ufff0\u0000\b\u0004\u000f\t\u0010￭ￕ\t", 264, true, 34).intern();
            C0044.m109();
        }
        int i3 = f672 + 97;
        f669 = i3 % 128;
        if ((i3 % 2 != 0 ? '<' : (char) 6) != '<') {
        }
        return application;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static Application m733() {
        int i = f672 + 79;
        f669 = i % 128;
        int i2 = i % 2;
        try {
            Application application = (Application) Class.forName(m734(23, "\u000f\f\u0006\u0001ￋ\ufffe\r\rￋ\uffde\u0000\u0011\u0006\u0013\u0006\u0011\u0016\ufff1\u0005\u000f\u0002\ufffe\u0001\ufffe\u000b\u0001", 262, false, 26).intern()).getMethod(m734(7, "\n\u0004\ufffb\b\b\u000b\ufff9\u0004\u0005\uffff\n\ufff7\ufff9\uffff\u0002\u0006\u0006ￗ", 269, true, 18).intern(), new Class[0]).invoke(null, new Object[0]);
            int i3 = f669 + 9;
            f672 = i3 % 128;
            int i4 = i3 % 2;
            return application;
        } catch (Exception unused) {
            m734(5, "\u000e\u0003\t\bￔ￬\u000f\b\u000e\u0003\u0007\uffff\uffef\u000e\u0003\u0006ￔ�\u000f\f\f\uffff\b\u000eￛ\n\n\u0006\u0003�\ufffb", 265, false, 31).intern();
            C0044.m109();
            return null;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static String m734(int i, String str, int i2, boolean z, int i3) {
        char[] cArr;
        int i4 = f669 + 15;
        f672 = i4 % 128;
        int i5 = i4 % 2;
        char[] charArray = str.toCharArray();
        char[] cArr2 = new char[i3];
        int i6 = 0;
        while (true) {
            if (!(i6 < i3)) {
                break;
            }
            int i7 = f672 + 31;
            f669 = i7 % 128;
            if ((i7 % 2 != 0 ? '\t' : '^') != '^') {
                cArr2[i6] = (char) (i2 % charArray[i6]);
                cArr2[i6] = (char) (cArr2[i6] >>> f671);
                i6 += 126;
            } else {
                cArr2[i6] = (char) (charArray[i6] + i2);
                cArr2[i6] = (char) (cArr2[i6] - f671);
                i6++;
            }
        }
        if (!(i <= 0)) {
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            int i8 = i3 - i;
            System.arraycopy(cArr3, 0, cArr2, i8, i);
            System.arraycopy(cArr3, i, cArr2, 0, i8);
        }
        if (z) {
            int i9 = f669 + 65;
            f672 = i9 % 128;
            int i10 = i9 % 2;
            cArr = new char[i3];
            for (int i11 = 0; i11 < i3; i11++) {
                cArr[i11] = cArr2[(i3 - i11) - 1];
            }
            int i12 = f669 + 29;
            f672 = i12 % 128;
            int i13 = i12 % 2;
        } else {
            cArr = cArr2;
        }
        return new String(cArr);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final C0131 m735() {
        int i = f669 + 87;
        f672 = i % 128;
        int i2 = i % 2;
        C0131 c0131 = this.f676;
        int i3 = f672 + 11;
        f669 = i3 % 128;
        if (!(i3 % 2 != 0)) {
            return c0131;
        }
        Object obj = null;
        super.hashCode();
        return c0131;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final void m736(Runnable runnable) {
        int i = f672 + 51;
        f669 = i % 128;
        int i2 = i % 2;
        if (this.f674 == null || this.f674.get() == null) {
            this.f674 = new SoftReference<>(new Handler(Looper.getMainLooper()));
            int i3 = f669 + 59;
            f672 = i3 % 128;
            if (i3 % 2 == 0) {
            }
        }
        this.f674.get().postDelayed(runnable, 0L);
        int i4 = f669 + 27;
        f672 = i4 % 128;
        if (!(i4 % 2 == 0)) {
        }
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final void m737(C0131 c0131) {
        int i = f669 + 123;
        f672 = i % 128;
        int i2 = i % 2;
        this.f676 = c0131;
        int i3 = f672 + 55;
        f669 = i3 % 128;
        if ((i3 % 2 != 0 ? 'K' : (char) 29) != 'K') {
            return;
        }
        Object obj = null;
        super.hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r0 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        r2 = '!';
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r2 == ':') goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        r0 = com.aiming.mdt.a.C0195.f669 + 95;
        com.aiming.mdt.a.C0195.f672 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if ((r0 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r0 = '\"';
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (r0 == 'E') goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        r0 = m732();
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        r0 = m732();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        r0 = 'E';
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r3.f675 = new java.lang.ref.SoftReference<>(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        return r3.f675.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0036, code lost:
    
        r2 = ':';
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0029, code lost:
    
        if (r3.f675.get() != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0021, code lost:
    
        if (r3.f675 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if ((r3.f675 != null) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r0 = m733();
     */
    /* renamed from: ʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Application m738() {
        int i = f672 + 105;
        f669 = i % 128;
        if ((i % 2 != 0 ? '\t' : (char) 28) != '\t') {
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m739(C0109 c0109) {
        int i = f669 + 79;
        f672 = i % 128;
        if ((i % 2 == 0 ? '\t' : 'O') != 'O') {
            this.f673 = c0109;
            Object obj = null;
            super.hashCode();
        } else {
            this.f673 = c0109;
        }
        int i2 = f672 + 113;
        f669 = i2 % 128;
        if ((i2 % 2 != 0 ? 'Q' : '3') != '3') {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (r3.f674.get() == null) goto L9;
     */
    /* renamed from: ʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m740(Runnable runnable) {
        int i = f669 + 43;
        f672 = i % 128;
        int i2 = i % 2;
        if ((this.f674 != null ? (char) 26 : ';') != ';') {
            int i3 = f669 + 15;
            f672 = i3 % 128;
            int i4 = i3 % 2;
        }
        this.f674 = new SoftReference<>(new Handler(Looper.getMainLooper()));
        this.f674.get().postDelayed(runnable, TapjoyConstants.TIMER_INCREMENT);
        int i5 = f672 + 31;
        f669 = i5 % 128;
        if (!(i5 % 2 != 0)) {
        }
    }
}
