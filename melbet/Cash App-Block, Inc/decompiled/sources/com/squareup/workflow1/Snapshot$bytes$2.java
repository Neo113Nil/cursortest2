package com.squareup.workflow1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Snapshot$bytes$2 extends Lambda implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Snapshot this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Snapshot$bytes$2(Snapshot snapshot, int i) {
        super(0);
        this.$r8$classId = i;
        this.this$0 = snapshot;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Snapshot snapshot = this.this$0;
        switch (i) {
            case 0:
                return (ByteString) snapshot.toByteString.invoke();
            default:
                if (snapshot == null || snapshot.bytes().getSize$okio() == 0) {
                    return null;
                }
                return snapshot;
        }
    }
}
