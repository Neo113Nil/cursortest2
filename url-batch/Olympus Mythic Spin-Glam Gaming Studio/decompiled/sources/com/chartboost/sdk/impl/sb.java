package com.chartboost.sdk.impl;

import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class sb {
    public static final a c;
    public static final sb d = new sb("CONCURRENT", 0, 0);
    public static final sb e = new sb("SEQUENTIAL", 1, 1);
    public static final /* synthetic */ sb[] f;
    public static final /* synthetic */ EnumEntries g;
    public final int b;

    static {
        sb[] a2 = a();
        f = a2;
        g = EnumEntriesKt.enumEntries(a2);
        c = new a(null);
    }

    public static final /* synthetic */ sb[] a() {
        return new sb[]{d, e};
    }

    public static EnumEntries b() {
        return g;
    }

    public static sb valueOf(String str) {
        return (sb) Enum.valueOf(sb.class, str);
    }

    public static sb[] values() {
        return (sb[]) f.clone();
    }

    public sb(String str, int i, int i2) {
        this.b = i2;
    }

    public final int c() {
        return this.b;
    }

    public static final class a {
        public final sb a(int i) {
            Object obj;
            Iterator<E> it = sb.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((sb) obj).c() == i) {
                    break;
                }
            }
            sb sbVar = (sb) obj;
            return sbVar == null ? sb.e : sbVar;
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
