package com.aiming.mdt.a;

import android.content.Context;
import android.text.TextUtils;
import com.aiming.mdt.a.RunnableC0196;
import com.aiming.mdt.utils.C0282;

/* renamed from: com.aiming.mdt.a.ʽˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0172 implements RunnableC0196.InterfaceC0197 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final EnumC0173 f581;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private final int f582;

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    private final InterfaceC0041 f583;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private final String f584;

    /* renamed from: ʻʽʾ, reason: contains not printable characters */
    private boolean f585;

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private final boolean f586;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final C0110 f587;

    /* renamed from: ʼʽ, reason: contains not printable characters */
    private final Object f588;

    /* renamed from: ʼʽʾ, reason: contains not printable characters */
    private Context f589;

    /* renamed from: ʼʾ, reason: contains not printable characters */
    private final InterfaceC0174 f590;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final int f591;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final boolean f592;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: com.aiming.mdt.a.ʽˊ$ʻʽ, reason: contains not printable characters */
    public static final class EnumC0173 {

        /* renamed from: ʻʽ, reason: contains not printable characters */
        public static final EnumC0173 f593 = new EnumC0173("GET", 0, "GET");

        /* renamed from: ʽ, reason: contains not printable characters */
        public static final EnumC0173 f594 = new EnumC0173("POST", 1, "POST");

        /* renamed from: ʻ, reason: contains not printable characters */
        private final String f595;

        static {
            EnumC0173[] enumC0173Arr = {f593, f594};
        }

        private EnumC0173(String str, int i, String str2) {
            this.f595 = str2;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.f595;
        }
    }

    /* renamed from: com.aiming.mdt.a.ʽˊ$ʼ, reason: contains not printable characters */
    public interface InterfaceC0174 {
        /* renamed from: ʻʽ */
        void mo12(C0052 c0052);

        /* renamed from: ʼ */
        void mo14(String str);
    }

    /* renamed from: com.aiming.mdt.a.ʽˊ$ʽ, reason: contains not printable characters */
    public static class C0175 {

        /* renamed from: ʻ, reason: contains not printable characters */
        private int f596;

        /* renamed from: ʻʼ, reason: contains not printable characters */
        private String f597;

        /* renamed from: ʻʽ, reason: contains not printable characters */
        private int f598;

        /* renamed from: ʻʾ, reason: contains not printable characters */
        private InterfaceC0041 f599;

        /* renamed from: ʼ, reason: contains not printable characters */
        private EnumC0173 f600;

        /* renamed from: ʼʽ, reason: contains not printable characters */
        private boolean f601;

        /* renamed from: ʽ, reason: contains not printable characters */
        private C0110 f602;

        /* renamed from: ʾ, reason: contains not printable characters */
        private InterfaceC0174 f603;

        /* renamed from: ʼʽ, reason: contains not printable characters */
        static /* synthetic */ boolean m659(C0175 c0175) {
            return false;
        }

        /* renamed from: ʻʼ, reason: contains not printable characters */
        public final C0052 m663() {
            return C0172.m640(new C0172(this, (byte) 0));
        }

        /* renamed from: ʻʼ, reason: contains not printable characters */
        public final C0175 m664(InterfaceC0174 interfaceC0174) {
            this.f603 = interfaceC0174;
            return this;
        }

        /* renamed from: ʻʽ, reason: contains not printable characters */
        public final C0175 m665(InterfaceC0041 interfaceC0041) {
            this.f599 = interfaceC0041;
            return this;
        }

        /* renamed from: ʻʽ, reason: contains not printable characters */
        public final C0175 m666(EnumC0173 enumC0173) {
            this.f600 = enumC0173;
            return this;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public final C0175 m667(int i) {
            this.f596 = i;
            return this;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public final C0175 m668(C0110 c0110) {
            this.f602 = c0110;
            return this;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public final C0175 m669(boolean z) {
            this.f601 = true;
            return this;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public final void m670(Context context) {
            C0172.m641(new C0172(this, (byte) 0), context);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public final C0175 m671(int i) {
            this.f598 = i;
            return this;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public final C0175 m672(String str) {
            this.f597 = str;
            return this;
        }
    }

    private C0172(C0175 c0175) {
        this.f581 = c0175.f600;
        this.f587 = c0175.f602;
        this.f591 = c0175.f598;
        this.f582 = c0175.f596;
        this.f584 = c0175.f597;
        this.f583 = c0175.f599;
        this.f592 = c0175.f601;
        this.f586 = C0175.m659(c0175);
        this.f590 = c0175.f603;
        this.f588 = null;
    }

    /* synthetic */ C0172(C0175 c0175, byte b2) {
        this(c0175);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static /* synthetic */ C0052 m640(C0172 c0172) {
        c0172.f585 = true;
        return new C0094(c0172).m363();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static /* synthetic */ void m641(C0172 c0172, Context context) {
        if (context == null) {
            InterfaceC0174 interfaceC0174 = c0172.f590;
            if (interfaceC0174 == null) {
                throw new IllegalArgumentException("Context error");
            }
            interfaceC0174.mo14("Context error");
            return;
        }
        if (TextUtils.isEmpty(c0172.f584)) {
            InterfaceC0174 interfaceC01742 = c0172.f590;
            if (interfaceC01742 == null) {
                throw new IllegalArgumentException("request need a valid url, current is empty");
            }
            interfaceC01742.mo14("request need a valid url, current is empty");
            return;
        }
        c0172.f589 = context;
        RunnableC0196 runnableC0196 = new RunnableC0196(c0172);
        runnableC0196.m741(c0172);
        C0127.m476(runnableC0196);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final C0110 m642() {
        return this.f587;
    }

    @Override // com.aiming.mdt.a.RunnableC0196.InterfaceC0197
    /* renamed from: ʻ, reason: contains not printable characters */
    public void mo643(C0052 c0052) {
        if (this.f590 != null) {
            this.f590.mo12(c0052);
            return;
        }
        if (c0052 != null) {
            try {
                c0052.close();
            } catch (Exception e) {
                C0282.m972("IOUtil", e);
                C0076.m232().m236(e);
            }
        }
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final EnumC0173 m644() {
        return this.f581;
    }

    @Override // com.aiming.mdt.a.RunnableC0196.InterfaceC0197
    /* renamed from: ʻʼ, reason: contains not printable characters */
    public void mo645(String str) {
        if (this.f590 != null) {
            this.f590.mo14(str);
        }
    }

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    public final boolean m646() {
        return this.f592;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final InterfaceC0041 m647() {
        return this.f583;
    }

    /* renamed from: ʻʾ, reason: contains not printable characters */
    public final int m648() {
        return this.f582;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final String m649() {
        return this.f584;
    }

    /* renamed from: ʼʽ, reason: contains not printable characters */
    public final boolean m650() {
        return this.f586;
    }

    /* renamed from: ʼʾ, reason: contains not printable characters */
    public final boolean m651() {
        return this.f585 || this.f590 != null;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final int m652() {
        return this.f591;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public final Context m653() {
        return this.f589;
    }
}
