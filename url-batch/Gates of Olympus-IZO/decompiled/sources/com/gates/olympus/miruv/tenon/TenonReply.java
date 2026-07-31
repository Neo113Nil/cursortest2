package com.gates.olympus.miruv.tenon;

import Z1.e;
import Z1.i;
import h.AbstractC0416e;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import v2.b;
import w2.W;
import w2.a0;

/* loaded from: classes.dex */
public final class TenonReply {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    private final String time;
    private final String url;

    public static final class Companion {
        public final KSerializer serializer() {
            return TenonReply$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TenonReply() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (e) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ TenonReply copy$default(TenonReply tenonReply, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = tenonReply.url;
        }
        if ((i3 & 2) != 0) {
            str2 = tenonReply.time;
        }
        return tenonReply.copy(str, str2);
    }

    public static final void write$Self$app_release(TenonReply tenonReply, b bVar, SerialDescriptor serialDescriptor) {
        AbstractC0416e abstractC0416e = (AbstractC0416e) bVar;
        abstractC0416e.getClass();
        i.f(serialDescriptor, "descriptor");
        a0 a0Var = a0.f8646a;
        abstractC0416e.q(serialDescriptor, 0, tenonReply.url);
        abstractC0416e.q(serialDescriptor, 1, tenonReply.time);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.time;
    }

    public final TenonReply copy(String str, String str2) {
        return new TenonReply(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TenonReply)) {
            return false;
        }
        TenonReply tenonReply = (TenonReply) obj;
        return i.a(this.url, tenonReply.url) && i.a(this.time, tenonReply.time);
    }

    public final String getTime() {
        return this.time;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.time;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "TenonReply(url=" + this.url + ", time=" + this.time + ")";
    }

    public TenonReply(int i3, String str, String str2, W w3) {
        if ((i3 & 1) == 0) {
            this.url = null;
        } else {
            this.url = str;
        }
        if ((i3 & 2) == 0) {
            this.time = null;
        } else {
            this.time = str2;
        }
    }

    public TenonReply(String str, String str2) {
        this.url = str;
        this.time = str2;
    }

    public /* synthetic */ TenonReply(String str, String str2, int i3, e eVar) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2);
    }
}
