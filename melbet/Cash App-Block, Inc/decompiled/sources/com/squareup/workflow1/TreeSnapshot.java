package com.squareup.workflow1;

import com.squareup.workflow1.internal.WorkflowNodeId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class TreeSnapshot {
    public final Lazy childTreeSnapshots$delegate;
    public final Lazy workflowSnapshot$delegate;

    public TreeSnapshot(Snapshot snapshot, Function0 function0) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.workflowSnapshot$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Snapshot$bytes$2(snapshot, 1));
        this.childTreeSnapshots$delegate = LazyKt.lazy(lazyThreadSafetyMode, function0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TreeSnapshot)) {
            return false;
        }
        TreeSnapshot treeSnapshot = (TreeSnapshot) obj;
        return Intrinsics.areEqual((Snapshot) treeSnapshot.workflowSnapshot$delegate.getValue(), (Snapshot) this.workflowSnapshot$delegate.getValue()) && Intrinsics.areEqual((Map) treeSnapshot.childTreeSnapshots$delegate.getValue(), (Map) this.childTreeSnapshots$delegate.getValue());
    }

    public final int hashCode() {
        Snapshot snapshot = (Snapshot) this.workflowSnapshot$delegate.getValue();
        return ((Map) this.childTreeSnapshots$delegate.getValue()).hashCode() + ((snapshot == null ? 0 : snapshot.hashCode()) * 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ByteString toByteString() {
        ByteString readByteString;
        Pair pair;
        Buffer buffer = new Buffer();
        Snapshot snapshot = (Snapshot) this.workflowSnapshot$delegate.getValue();
        ByteString bytes = snapshot == null ? null : snapshot.bytes();
        if (bytes == null) {
            bytes = ByteString.EMPTY;
        }
        Snapshots.writeByteStringWithLength(buffer, bytes);
        Map map = (Map) this.childTreeSnapshots$delegate.getValue();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            WorkflowNodeId workflowNodeId = (WorkflowNodeId) entry.getKey();
            TreeSnapshot treeSnapshot = (TreeSnapshot) entry.getValue();
            ByteString byteStringOrNull = workflowNodeId.identifier.toByteStringOrNull();
            if (byteStringOrNull == null) {
                readByteString = null;
            } else {
                Buffer buffer2 = new Buffer();
                Snapshots.writeByteStringWithLength(buffer2, byteStringOrNull);
                String str = workflowNodeId.name;
                str.getClass();
                ByteString.Companion companion = ByteString.Companion;
                Snapshots.writeByteStringWithLength(buffer2, ByteString.Companion.encodeUtf8(str));
                readByteString = buffer2.readByteString(buffer2.size);
            }
            if (readByteString != null) {
                ByteString byteString = treeSnapshot.toByteString();
                if (byteString.getSize$okio() == 0) {
                    byteString = null;
                }
                if (byteString != null) {
                    pair = new Pair(readByteString, byteString);
                    if (pair == null) {
                        arrayList.add(pair);
                    }
                }
            }
            pair = null;
            if (pair == null) {
            }
        }
        buffer.m4336writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair2 = (Pair) it.next();
            ByteString byteString2 = (ByteString) pair2.first;
            ByteString byteString3 = (ByteString) pair2.second;
            Snapshots.writeByteStringWithLength(buffer, byteString2);
            Snapshots.writeByteStringWithLength(buffer, byteString3);
        }
        return buffer.readByteString(buffer.size);
    }
}
