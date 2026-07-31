package com.chartboost.sdk.impl;

import com.mobilefuse.sdk.mraid.MraidAdRenderer;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class eg {
    public static final a c;
    public static final eg d = new eg(MraidAdRenderer.LOG_TAG, 0, "mraid");
    public static final eg e = new eg("HTML", 1, "html");
    public static final eg f = new eg(VastTagName.VAST, 2, "vast");
    public static final eg g = new eg("UNKNOWN", 3, "unknown");
    public static final /* synthetic */ eg[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String b;

    static {
        eg[] a2 = a();
        h = a2;
        i = EnumEntriesKt.enumEntries(a2);
        c = new a(null);
    }

    public static final /* synthetic */ eg[] a() {
        return new eg[]{d, e, f, g};
    }

    public static EnumEntries b() {
        return i;
    }

    public static eg valueOf(String str) {
        return (eg) Enum.valueOf(eg.class, str);
    }

    public static eg[] values() {
        return (eg[]) h.clone();
    }

    public eg(String str, int i2, String str2) {
        this.b = str2;
    }

    public final String c() {
        return this.b;
    }

    public static final class a {
        public final eg a(String str) {
            Object obj;
            Iterator<E> it = eg.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (StringsKt.equals(((eg) obj).c(), str, true)) {
                    break;
                }
            }
            eg egVar = (eg) obj;
            return egVar == null ? eg.g : egVar;
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
