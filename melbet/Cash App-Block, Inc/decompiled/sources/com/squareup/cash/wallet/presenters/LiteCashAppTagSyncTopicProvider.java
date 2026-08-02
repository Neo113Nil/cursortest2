package com.squareup.cash.wallet.presenters;

import com.squareup.cash.clientsync.models.SyncTopic;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;

/* loaded from: classes.dex */
public final class LiteCashAppTagSyncTopicProvider {
    public final /* synthetic */ int $r8$classId;

    public final Set topicsToSync(List list) {
        int i = this.$r8$classId;
        list.getClass();
        switch (i) {
            case 0:
                break;
            default:
                SyncTopic syncTopic = SyncTopic.UNKNOWN;
                SyncTopic syncTopic2 = SyncTopic.CASH_APP_TAG;
                if (!list.contains(46)) {
                    break;
                } else {
                    break;
                }
        }
        return EmptySet.INSTANCE;
    }
}
