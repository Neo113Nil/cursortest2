package androidx.compose.runtime.snapshots;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import com.safedk.android.analytics.brandsafety.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import org.jetbrains.annotations.NotNull;

/* compiled from: SnapshotStateList.android.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 R*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006:\u0001RB\u0017\b\u0000\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nB\t\b\u0016¢\u0006\u0004\b\t\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\"\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b'\u0010!J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016¢\u0006\u0004\b)\u0010*J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b)\u0010+J%\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u001cH\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b3\u0010\u0017J\u001f\u00103\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b3\u00104J%\u00105\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b5\u00106J\u001d\u00105\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b5\u0010\u001bJ\u000f\u00107\u001a\u00020\u000eH\u0016¢\u0006\u0004\b7\u0010\u000bJ\u0017\u00108\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b8\u0010\u0017J\u001d\u00109\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b9\u0010\u001bJ\u0017\u0010:\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b:\u0010\u001fJ\u001d\u0010;\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b;\u0010\u001bJ \u0010<\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b<\u0010=J\u001d\u0010>\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u001c¢\u0006\u0004\b>\u0010?J-\u0010D\u001a\u00020\u001c2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010@\u001a\u00020\u001c2\u0006\u0010A\u001a\u00020\u001cH\u0000¢\u0006\u0004\bB\u0010CJ\u001f\u0010H\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020\u001cH\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u001cH\u0016¢\u0006\u0004\bJ\u0010KR$\u0010L\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010K¨\u0006S"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", "T", "Landroid/os/Parcelable;", "Landroidx/compose/runtime/snapshots/StateObject;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "persistentList", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V", "()V", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "", "prependStateRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "", "toList", "()Ljava/util/List;", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "", "toString", "()Ljava/lang/String;", m.l, "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "removeRange", "(II)V", "start", "end", "retainAllInRange$runtime", "(Ljava/util/Collection;II)I", "retainAllInRange", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "firstStateRecord", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "getSize", "size", "Companion", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
@Stable
/* loaded from: classes10.dex */
public final class SnapshotStateList<T> implements Parcelable, StateObject, List<T>, RandomAccess, KMutableList {
    private StateRecord firstStateRecord;

    @NotNull
    public static final Parcelable.Creator<SnapshotStateList<Object>> CREATOR = new SnapshotStateList$Companion$CREATOR$1();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return CollectionToArray.toArray(this, objArr);
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i) {
        return removeAt(i);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    public SnapshotStateList(PersistentList persistentList) {
        this.firstStateRecord = SnapshotStateListKt.stateRecordWith(this, persistentList);
    }

    public SnapshotStateList() {
        this(ExtensionsKt.persistentListOf());
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord value) {
        value.setNext$runtime(getFirstStateRecord());
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.firstStateRecord = (StateListStateRecord) value;
    }

    public final List toList() {
        return SnapshotStateListKt.getReadable(this).getList();
    }

    public int getSize() {
        return SnapshotStateListKt.getReadable(this).getList().size();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        return SnapshotStateListKt.getReadable(this).getList().contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection elements) {
        return SnapshotStateListKt.getReadable(this).getList().containsAll(elements);
    }

    @Override // java.util.List
    public Object get(int index) {
        return SnapshotStateListKt.getReadable(this).getList().get(index);
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        return SnapshotStateListKt.getReadable(this).getList().indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return SnapshotStateListKt.getReadable(this).getList().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        return SnapshotStateListKt.getReadable(this).getList().lastIndexOf(element);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new StateListIterator(this, 0);
    }

    @Override // java.util.List
    public ListIterator listIterator(int index) {
        return new StateListIterator(this, index);
    }

    @Override // java.util.List
    public List subList(int fromIndex, int toIndex) {
        if (!(fromIndex >= 0 && fromIndex <= toIndex && toIndex <= size())) {
            PreconditionsKt.throwIllegalArgumentException("fromIndex or toIndex are out of bounds");
        }
        return new SubList(this, fromIndex, toIndex);
    }

    public String toString() {
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord)).getList() + ")@" + hashCode();
    }

    @Override // java.util.List
    public boolean addAll(final int index, final Collection elements) {
        return SnapshotStateListKt.mutateBoolean(this, new Function1() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean addAll$lambda$4;
                addAll$lambda$4 = SnapshotStateList.addAll$lambda$4(index, elements, (List) obj);
                return Boolean.valueOf(addAll$lambda$4);
            }
        });
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        Snapshot current;
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        StateListStateRecord stateListStateRecord = (StateListStateRecord) firstStateRecord;
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.INSTANCE.getCurrent();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord, this, current);
            synchronized (SnapshotStateListKt.sync) {
                stateListStateRecord2.setList$runtime(ExtensionsKt.persistentListOf());
                stateListStateRecord2.setModification$runtime(stateListStateRecord2.getModification() + 1);
                stateListStateRecord2.setStructuralChange$runtime(stateListStateRecord2.getStructuralChange() + 1);
            }
        }
        SnapshotKt.notifyWrite(current, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addAll$lambda$4(int i, Collection collection, List list) {
        return list.addAll(i, collection);
    }

    public final void removeRange(int fromIndex, int toIndex) {
        int modification;
        PersistentList list;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list = stateListStateRecord.getList();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list);
            PersistentList.Builder builder = list.builder();
            builder.subList(fromIndex, toIndex).clear();
            PersistentList build = builder.build();
            if (Intrinsics.areEqual(build, list)) {
                return;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                attemptUpdate = SnapshotStateListKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification, build, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
    }

    public Object removeAt(int index) {
        int modification;
        PersistentList list;
        Snapshot current;
        boolean attemptUpdate;
        Object obj = get(index);
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list = stateListStateRecord.getList();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list);
            PersistentList removeAt = list.removeAt(index);
            if (Intrinsics.areEqual(removeAt, list)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                attemptUpdate = SnapshotStateListKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification, removeAt, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(final Collection elements) {
        return SnapshotStateListKt.mutateBoolean(this, new Function1() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean retainAll$lambda$10;
                retainAll$lambda$10 = SnapshotStateList.retainAll$lambda$10(elements, (List) obj);
                return Boolean.valueOf(retainAll$lambda$10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean retainAll$lambda$10(Collection collection, List list) {
        return list.retainAll(collection);
    }

    @Override // java.util.List
    public Object set(int index, Object element) {
        int modification;
        PersistentList list;
        Snapshot current;
        boolean attemptUpdate;
        Object obj = get(index);
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list = stateListStateRecord.getList();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list);
            PersistentList persistentList = list.set(index, element);
            if (Intrinsics.areEqual(persistentList, list)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                attemptUpdate = SnapshotStateListKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification, persistentList, false);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return obj;
    }

    public final int retainAllInRange$runtime(Collection elements, int start, int end) {
        int modification;
        PersistentList list;
        Snapshot current;
        boolean attemptUpdate;
        int size = size();
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list = stateListStateRecord.getList();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list);
            PersistentList.Builder builder = list.builder();
            builder.subList(start, end).retainAll(elements);
            PersistentList build = builder.build();
            if (Intrinsics.areEqual(build, list)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                attemptUpdate = SnapshotStateListKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification, build, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return size - size();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        List list = toList();
        int size = list.size();
        parcel.writeInt(size);
        for (int i = 0; i < size; i++) {
            parcel.writeValue(list.get(i));
        }
    }

    @Override // java.util.List
    public void add(int index, Object element) {
        int modification;
        PersistentList list;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list = stateListStateRecord.getList();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list);
            PersistentList add = list.add(index, element);
            if (Intrinsics.areEqual(add, list)) {
                return;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                attemptUpdate = SnapshotStateListKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification, add, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object element) {
        int modification;
        PersistentList list;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list = stateListStateRecord.getList();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list);
            PersistentList add = list.add(element);
            if (Intrinsics.areEqual(add, list)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                attemptUpdate = SnapshotStateListKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification, add, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection elements) {
        int modification;
        PersistentList list;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list = stateListStateRecord.getList();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list);
            PersistentList addAll = list.addAll(elements);
            if (Intrinsics.areEqual(addAll, list)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                attemptUpdate = SnapshotStateListKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification, addAll, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object element) {
        int modification;
        PersistentList list;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list = stateListStateRecord.getList();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list);
            PersistentList remove = list.remove(element);
            if (Intrinsics.areEqual(remove, list)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                attemptUpdate = SnapshotStateListKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification, remove, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection elements) {
        int modification;
        PersistentList list;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list = stateListStateRecord.getList();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list);
            PersistentList removeAll = list.removeAll(elements);
            if (Intrinsics.areEqual(removeAll, list)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                attemptUpdate = SnapshotStateListKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification, removeAll, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return true;
    }
}
