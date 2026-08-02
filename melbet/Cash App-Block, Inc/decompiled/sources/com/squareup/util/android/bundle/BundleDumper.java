package com.squareup.util.android.bundle;

import android.os.Bundle;
import android.os.Parcel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes4.dex */
public final class BundleDumper {

    public final class KeyAndValueSize {
        public final List children;
        public final String key;
        public final int valueSize;

        public KeyAndValueSize(String str, List list, int i) {
            list.getClass();
            this.key = str;
            this.valueSize = i;
            this.children = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KeyAndValueSize)) {
                return false;
            }
            KeyAndValueSize keyAndValueSize = (KeyAndValueSize) obj;
            return this.key.equals(keyAndValueSize.key) && this.valueSize == keyAndValueSize.valueSize && Intrinsics.areEqual(this.children, keyAndValueSize.children);
        }

        public final String format() {
            return String.format(Locale.US, "%s = %,.3f KB", Arrays.copyOf(new Object[]{this.key, Float.valueOf(this.valueSize / 1000.0f)}, 2));
        }

        public final boolean formatRecursively(int i, StringBuilder sb) {
            List<KeyAndValueSize> list = this.children;
            for (KeyAndValueSize keyAndValueSize : list) {
                if (sb.length() >= 10240) {
                    sb.append("\n...[Content truncated]...");
                    return false;
                }
                sb.append("\n");
                int i2 = 1 + i;
                sb.append(StringsKt__StringsJVMKt.repeat(i2, "  "));
                sb.append(keyAndValueSize.format());
                if (!list.isEmpty() && !keyAndValueSize.formatRecursively(i2, sb)) {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode() {
            return this.children.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.valueSize, this.key.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(format());
            formatRecursively(0, sb);
            return sb.toString();
        }
    }

    public static KeyAndValueSize calculateKeyAndValueSize(Bundle bundle) {
        ArrayList arrayList = new ArrayList(bundle.size());
        Bundle bundle2 = new Bundle(bundle);
        try {
            int parcelSize = parcelSize(bundle);
            for (String str : bundle2.keySet()) {
                Object obj = bundle.get(str);
                List list = obj instanceof Bundle ? calculateKeyAndValueSize((Bundle) obj).children : EmptyList.INSTANCE;
                bundle.remove(str);
                int parcelSize2 = parcelSize(bundle);
                str.getClass();
                arrayList.add(new KeyAndValueSize(str, list, parcelSize - parcelSize2));
                parcelSize = parcelSize2;
            }
            bundle.putAll(bundle2);
            return new KeyAndValueSize("Root Bundle", arrayList, parcelSize(bundle));
        } catch (Throwable th) {
            bundle.putAll(bundle2);
            throw th;
        }
    }

    public static String dumpKeyAndValueSizes$default(Bundle bundle) {
        KeyAndValueSize calculateKeyAndValueSize = calculateKeyAndValueSize(bundle);
        StringBuilder sb = new StringBuilder(calculateKeyAndValueSize.format());
        calculateKeyAndValueSize.formatRecursively(0, sb);
        return sb.toString();
    }

    public static int parcelSize(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        obtain.getClass();
        try {
            obtain.writeBundle(bundle);
            return obtain.dataSize();
        } finally {
            obtain.recycle();
        }
    }
}
