package org.asyncstorage.shared_storage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Entry.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lorg/asyncstorage/shared_storage/Entry;", "", "key", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shared-storage"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Entry {
    private final String key;
    private final String value;

    public static /* synthetic */ Entry copy$default(Entry entry, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = entry.key;
        }
        if ((i & 2) != 0) {
            str2 = entry.value;
        }
        return entry.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final Entry copy(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new Entry(key, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) other;
        return Intrinsics.areEqual(this.key, entry.key) && Intrinsics.areEqual(this.value, entry.value);
    }

    public int hashCode() {
        int hashCode = this.key.hashCode() * 31;
        String str = this.value;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "Entry(key=" + this.key + ", value=" + this.value + ')';
    }

    public Entry(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
        this.value = str;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getValue() {
        return this.value;
    }
}
