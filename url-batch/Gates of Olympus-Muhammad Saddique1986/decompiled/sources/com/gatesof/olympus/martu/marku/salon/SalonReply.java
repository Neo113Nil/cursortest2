package com.gatesof.olympus.martu.marku.salon;

import B2.b;
import C2.W;
import C2.a0;
import a.AbstractC0235a;
import f2.e;
import f2.j;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class SalonReply {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    private final String time;
    private final String url;

    public static final class Companion {
        public final KSerializer serializer() {
            return SalonReply$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SalonReply() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (e) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ SalonReply copy$default(SalonReply salonReply, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = salonReply.url;
        }
        if ((i3 & 2) != 0) {
            str2 = salonReply.time;
        }
        return salonReply.copy(str, str2);
    }

    public static final void write$Self$app_release(SalonReply salonReply, b bVar, SerialDescriptor serialDescriptor) {
        AbstractC0235a abstractC0235a = (AbstractC0235a) bVar;
        abstractC0235a.getClass();
        j.f(serialDescriptor, "descriptor");
        a0 a0Var = a0.f733a;
        abstractC0235a.t(serialDescriptor, 0, salonReply.url);
        abstractC0235a.t(serialDescriptor, 1, salonReply.time);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.time;
    }

    public final SalonReply copy(String str, String str2) {
        return new SalonReply(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SalonReply)) {
            return false;
        }
        SalonReply salonReply = (SalonReply) obj;
        return j.a(this.url, salonReply.url) && j.a(this.time, salonReply.time);
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
        return "SalonReply(url=" + this.url + ", time=" + this.time + ")";
    }

    public SalonReply(int i3, String str, String str2, W w2) {
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

    public SalonReply(String str, String str2) {
        this.url = str;
        this.time = str2;
    }

    public /* synthetic */ SalonReply(String str, String str2, int i3, e eVar) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2);
    }
}
