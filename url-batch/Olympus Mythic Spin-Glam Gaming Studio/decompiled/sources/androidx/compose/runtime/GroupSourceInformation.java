package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.ironsource.B5;
import com.safedk.android.analytics.brandsafety.m;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlotTable.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0014J%\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\fR\u0017\u0010\u0019\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0017\u0010$\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u001cR6\u0010(\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010&j\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001`'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010.\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00104\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u001a\u001a\u0004\b5\u0010\u001c\"\u0004\b6\u00107¨\u00068"}, d2 = {"Landroidx/compose/runtime/GroupSourceInformation;", "", "openInformation", "()Landroidx/compose/runtime/GroupSourceInformation;", "group", "", m.l, "(Ljava/lang/Object;)V", "Landroidx/compose/runtime/Anchor;", "anchor", "", "hasAnchor", "(Landroidx/compose/runtime/Anchor;)Z", "Landroidx/compose/runtime/SlotWriter;", "writer", "", "reportGroup", "(Landroidx/compose/runtime/SlotWriter;I)V", "Landroidx/compose/runtime/SlotTable;", B5.R, "(Landroidx/compose/runtime/SlotTable;I)V", "predecessor", "addGroupAfter", "(Landroidx/compose/runtime/SlotWriter;II)V", "removeAnchor", "key", "I", "getKey", "()I", "", "sourceInformation", "Ljava/lang/String;", "getSourceInformation", "()Ljava/lang/String;", "setSourceInformation", "(Ljava/lang/String;)V", "dataStartOffset", "getDataStartOffset", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "groups", "Ljava/util/ArrayList;", "getGroups", "()Ljava/util/ArrayList;", "setGroups", "(Ljava/util/ArrayList;)V", "closed", "Z", "getClosed", "()Z", "setClosed", "(Z)V", "dataEndOffset", "getDataEndOffset", "setDataEndOffset", "(I)V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GroupSourceInformation {
    private boolean closed;
    private int dataEndOffset;
    private final int dataStartOffset;
    private ArrayList groups;
    private final int key;
    private String sourceInformation;

    public final int getKey() {
        return this.key;
    }

    public final String getSourceInformation() {
        return this.sourceInformation;
    }

    public final int getDataStartOffset() {
        return this.dataStartOffset;
    }

    public final ArrayList getGroups() {
        return this.groups;
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getDataEndOffset() {
        return this.dataEndOffset;
    }

    public final void reportGroup(SlotWriter writer, int group) {
        openInformation().add(writer.anchor(group));
    }

    public final void reportGroup(SlotTable table, int group) {
        openInformation().add(table.anchor(group));
    }

    public final void addGroupAfter(SlotWriter writer, int predecessor, int group) {
        Anchor tryAnchor$runtime;
        ArrayList arrayList = this.groups;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.groups = arrayList;
        }
        int i = 0;
        if (predecessor >= 0 && (tryAnchor$runtime = writer.tryAnchor$runtime(predecessor)) != null) {
            int size = arrayList.size();
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                }
                Object obj = arrayList.get(i);
                if (Intrinsics.areEqual(obj, tryAnchor$runtime) || ((obj instanceof GroupSourceInformation) && ((GroupSourceInformation) obj).hasAnchor(tryAnchor$runtime))) {
                    break;
                } else {
                    i++;
                }
            }
        }
        arrayList.add(i, writer.anchor(group));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    private final GroupSourceInformation openInformation() {
        GroupSourceInformation groupSourceInformation;
        GroupSourceInformation openInformation;
        ArrayList arrayList = this.groups;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                groupSourceInformation = arrayList.get(size);
                if ((groupSourceInformation instanceof GroupSourceInformation) && !((GroupSourceInformation) groupSourceInformation).closed) {
                    break;
                }
            }
        }
        groupSourceInformation = 0;
        GroupSourceInformation groupSourceInformation2 = groupSourceInformation instanceof GroupSourceInformation ? groupSourceInformation : null;
        return (groupSourceInformation2 == null || (openInformation = groupSourceInformation2.openInformation()) == null) ? this : openInformation;
    }

    private final void add(Object group) {
        ArrayList arrayList = this.groups;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.groups = arrayList;
        arrayList.add(group);
    }

    private final boolean hasAnchor(Anchor anchor) {
        ArrayList arrayList = this.groups;
        if (arrayList == null) {
            return false;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (Intrinsics.areEqual(obj, anchor) || ((obj instanceof GroupSourceInformation) && ((GroupSourceInformation) obj).hasAnchor(anchor))) {
                return true;
            }
        }
        return false;
    }

    public final boolean removeAnchor(Anchor anchor) {
        ArrayList arrayList = this.groups;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof Anchor) {
                    if (Intrinsics.areEqual(obj, anchor)) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof GroupSourceInformation) && !((GroupSourceInformation) obj).removeAnchor(anchor)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.groups = null;
                return false;
            }
        }
        return true;
    }
}
