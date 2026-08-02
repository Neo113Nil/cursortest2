package io.flutter.plugins.sharedpreferences;

import d3.j;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class SharedPreferencesPigeonOptions {
    public static final Companion Companion = new Companion(null);
    private final String fileName;
    private final boolean useDataStore;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final SharedPreferencesPigeonOptions fromList(List<? extends Object> pigeonVar_list) {
            i.e(pigeonVar_list, "pigeonVar_list");
            String str = (String) pigeonVar_list.get(0);
            Object obj = pigeonVar_list.get(1);
            i.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return new SharedPreferencesPigeonOptions(str, ((Boolean) obj).booleanValue());
        }

        private Companion() {
        }
    }

    public SharedPreferencesPigeonOptions(String str, boolean z) {
        this.fileName = str;
        this.useDataStore = z;
    }

    public static /* synthetic */ SharedPreferencesPigeonOptions copy$default(SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions, String str, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = sharedPreferencesPigeonOptions.fileName;
        }
        if ((i4 & 2) != 0) {
            z = sharedPreferencesPigeonOptions.useDataStore;
        }
        return sharedPreferencesPigeonOptions.copy(str, z);
    }

    public final String component1() {
        return this.fileName;
    }

    public final boolean component2() {
        return this.useDataStore;
    }

    public final SharedPreferencesPigeonOptions copy(String str, boolean z) {
        return new SharedPreferencesPigeonOptions(str, z);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SharedPreferencesPigeonOptions)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return MessagesAsyncPigeonUtils.INSTANCE.deepEquals(toList(), ((SharedPreferencesPigeonOptions) obj).toList());
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final boolean getUseDataStore() {
        return this.useDataStore;
    }

    public int hashCode() {
        return toList().hashCode();
    }

    public final List<Object> toList() {
        return j.W(this.fileName, Boolean.valueOf(this.useDataStore));
    }

    public String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.fileName + ", useDataStore=" + this.useDataStore + ")";
    }

    public /* synthetic */ SharedPreferencesPigeonOptions(String str, boolean z, int i4, e eVar) {
        this((i4 & 1) != 0 ? null : str, z);
    }
}
