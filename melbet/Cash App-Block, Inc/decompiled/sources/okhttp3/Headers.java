package okhttp3;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.work.impl.constraints.NetworkRequestConstraintController;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.constraints.controllers.BatteryNotLowController;
import androidx.work.impl.constraints.trackers.Trackers;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.internal._UtilCommonKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.AppUpdateData;

/* loaded from: classes3.dex */
public final class Headers implements Iterable, KMappedMarker {
    public static final Headers EMPTY = new Headers(new String[0]);
    public final String[] namesAndValues;

    public Headers(String[] strArr) {
        strArr.getClass();
        this.namesAndValues = strArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Headers) {
            return Arrays.equals(this.namesAndValues, ((Headers) obj).namesAndValues);
        }
        return false;
    }

    public final String get(String str) {
        String[] strArr = this.namesAndValues;
        strArr.getClass();
        int length = strArr.length - 2;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(length, 0, -2);
        if (progressionLastElement > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == progressionLastElement) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = new Pair(name(i), value(i));
        }
        return new ArrayIterator(pairArr);
    }

    public final String name(int i) {
        String str = (String) ArraysKt___ArraysKt.getOrNull(i * 2, this.namesAndValues);
        if (str != null) {
            return str;
        }
        Path$$ExternalSyntheticBUOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("name[", i, ']'));
        return null;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        CollectionsKt__MutableCollectionsKt.addAll(builder.namesAndValues, this.namesAndValues);
        return builder;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String name = name(i);
            String value = value(i);
            sb.append(name);
            sb.append(": ");
            if (_UtilCommonKt.isSensitiveHeader(name)) {
                value = "██";
            }
            sb.append(value);
            sb.append("\n");
        }
        return sb.toString();
    }

    public final String value(int i) {
        String str = (String) ArraysKt___ArraysKt.getOrNull((i * 2) + 1, this.namesAndValues);
        if (str != null) {
            return str;
        }
        Path$$ExternalSyntheticBUOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("value[", i, ']'));
        return null;
    }

    public final List values(String str) {
        str.getClass();
        str.getClass();
        int size = size();
        List list = null;
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (StringsKt__StringsJVMKt.equals(str, name(i), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i));
            }
        }
        if (arrayList != null) {
            list = Collections.unmodifiableList(arrayList);
            list.getClass();
        }
        return list == null ? EmptyList.INSTANCE : list;
    }

    public final class Builder {
        public final ArrayList namesAndValues;

        public Builder(Trackers trackers) {
            trackers.getClass();
            String str = WorkConstraintsTrackerKt.TAG;
            ArrayList mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new BatteryNotLowController(trackers.batteryChargingTracker, 1), new BatteryNotLowController(trackers.batteryNotLowTracker), new BatteryNotLowController(trackers.storageNotLowTracker, 2));
            Context context = trackers.context;
            context.getClass();
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            mutableListOf.add(new NetworkRequestConstraintController((ConnectivityManager) systemService));
            this.namesAndValues = mutableListOf;
        }

        public void add(String str, String str2) {
            str.getClass();
            str2.getClass();
            AppUpdateData.headersCheckName(str);
            AppUpdateData.headersCheckValue(str2, str);
            AppUpdateData.commonAddLenient(this, str, str2);
        }

        public void addLenient$okhttp(String str) {
            int indexOf$default = StringsKt.indexOf$default((CharSequence) str, ':', 1, false, 4);
            if (indexOf$default != -1) {
                AppUpdateData.commonAddLenient(this, str.substring(0, indexOf$default), str.substring(indexOf$default + 1));
            } else if (str.charAt(0) == ':') {
                AppUpdateData.commonAddLenient(this, "", str.substring(1));
            } else {
                AppUpdateData.commonAddLenient(this, "", str);
            }
        }

        public void addSpread(Object obj) {
            if (obj == null) {
                return;
            }
            boolean z = obj instanceof Object[];
            ArrayList arrayList = this.namesAndValues;
            if (z) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(arrayList, objArr);
                    return;
                }
                return;
            }
            if (obj instanceof Collection) {
                arrayList.addAll((Collection) obj);
                return;
            }
            if (obj instanceof Iterable) {
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            } else if (obj instanceof Iterator) {
                Iterator it2 = (Iterator) obj;
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
            } else {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
        }

        public void addUnsafeNonAscii(String str, String str2) {
            str.getClass();
            str2.getClass();
            AppUpdateData.headersCheckName(str);
            AppUpdateData.commonAddLenient(this, str, str2);
        }

        public Headers build() {
            return new Headers((String[]) this.namesAndValues.toArray(new String[0]));
        }

        public String get(String str) {
            str.getClass();
            ArrayList arrayList = this.namesAndValues;
            int size = arrayList.size() - 2;
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(size, 0, -2);
            if (progressionLastElement > size) {
                return null;
            }
            while (!str.equalsIgnoreCase((String) arrayList.get(size))) {
                if (size == progressionLastElement) {
                    return null;
                }
                size -= 2;
            }
            return (String) arrayList.get(size + 1);
        }

        public void removeAll(String str) {
            str.getClass();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.namesAndValues;
                if (i >= arrayList.size()) {
                    return;
                }
                if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                    arrayList.remove(i);
                    arrayList.remove(i);
                    i -= 2;
                }
                i += 2;
            }
        }

        public void add(Object obj) {
            this.namesAndValues.add(obj);
        }

        public Builder(int i) {
            this.namesAndValues = new ArrayList(i);
        }

        public Builder() {
            this.namesAndValues = new ArrayList(20);
        }
    }
}
