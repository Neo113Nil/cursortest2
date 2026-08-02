package com.google.firebase.database;

import com.google.firebase.database.ChildEvent;
import com.google.firebase.database.core.Repo;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProducerScope;

/* compiled from: Database.kt */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"com/google/firebase/database/DatabaseKt$childEvents$1$listener$1", "Lcom/google/firebase/database/ChildEventListener;", "onChildAdded", "", "snapshot", "Lcom/google/firebase/database/DataSnapshot;", "previousChildName", "", "onChildChanged", "onChildRemoved", "onChildMoved", "onCancelled", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/google/firebase/database/DatabaseError;", "com.google.firebase-firebase-database"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DatabaseKt$childEvents$1$listener$1 implements ChildEventListener {
    final /* synthetic */ ProducerScope<ChildEvent> $$this$callbackFlow;
    final /* synthetic */ Query $this_childEvents;

    /* JADX WARN: Multi-variable type inference failed */
    DatabaseKt$childEvents$1$listener$1(Query query, ProducerScope<? super ChildEvent> producerScope) {
        this.$this_childEvents = query;
        this.$$this$callbackFlow = producerScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onChildAdded$lambda$0(ProducerScope producerScope, DataSnapshot dataSnapshot, String str) {
        ChannelsKt.trySendBlocking(producerScope, new ChildEvent.Added(dataSnapshot, str));
    }

    @Override // com.google.firebase.database.ChildEventListener
    public void onChildAdded(final DataSnapshot snapshot, final String previousChildName) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Repo repo = this.$this_childEvents.repo;
        final ProducerScope<ChildEvent> producerScope = this.$$this$callbackFlow;
        repo.scheduleNow(new Runnable() { // from class: com.google.firebase.database.DatabaseKt$childEvents$1$listener$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                DatabaseKt$childEvents$1$listener$1.onChildAdded$lambda$0(ProducerScope.this, snapshot, previousChildName);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onChildChanged$lambda$1(ProducerScope producerScope, DataSnapshot dataSnapshot, String str) {
        ChannelsKt.trySendBlocking(producerScope, new ChildEvent.Changed(dataSnapshot, str));
    }

    @Override // com.google.firebase.database.ChildEventListener
    public void onChildChanged(final DataSnapshot snapshot, final String previousChildName) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Repo repo = this.$this_childEvents.repo;
        final ProducerScope<ChildEvent> producerScope = this.$$this$callbackFlow;
        repo.scheduleNow(new Runnable() { // from class: com.google.firebase.database.DatabaseKt$childEvents$1$listener$1$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                DatabaseKt$childEvents$1$listener$1.onChildChanged$lambda$1(ProducerScope.this, snapshot, previousChildName);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onChildRemoved$lambda$2(ProducerScope producerScope, DataSnapshot dataSnapshot) {
        ChannelsKt.trySendBlocking(producerScope, new ChildEvent.Removed(dataSnapshot));
    }

    @Override // com.google.firebase.database.ChildEventListener
    public void onChildRemoved(final DataSnapshot snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Repo repo = this.$this_childEvents.repo;
        final ProducerScope<ChildEvent> producerScope = this.$$this$callbackFlow;
        repo.scheduleNow(new Runnable() { // from class: com.google.firebase.database.DatabaseKt$childEvents$1$listener$1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                DatabaseKt$childEvents$1$listener$1.onChildRemoved$lambda$2(ProducerScope.this, snapshot);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onChildMoved$lambda$3(ProducerScope producerScope, DataSnapshot dataSnapshot, String str) {
        ChannelsKt.trySendBlocking(producerScope, new ChildEvent.Moved(dataSnapshot, str));
    }

    @Override // com.google.firebase.database.ChildEventListener
    public void onChildMoved(final DataSnapshot snapshot, final String previousChildName) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Repo repo = this.$this_childEvents.repo;
        final ProducerScope<ChildEvent> producerScope = this.$$this$callbackFlow;
        repo.scheduleNow(new Runnable() { // from class: com.google.firebase.database.DatabaseKt$childEvents$1$listener$1$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                DatabaseKt$childEvents$1$listener$1.onChildMoved$lambda$3(ProducerScope.this, snapshot, previousChildName);
            }
        });
    }

    @Override // com.google.firebase.database.ChildEventListener
    public void onCancelled(DatabaseError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        CoroutineScopeKt.cancel(this.$$this$callbackFlow, "Error getting Query childEvent", error.toException());
    }
}
