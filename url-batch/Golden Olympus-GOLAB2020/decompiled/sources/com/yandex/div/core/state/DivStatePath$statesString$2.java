package com.yandex.div.core.state;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivStatePath$statesString$2 extends s implements Function0<String> {
    final /* synthetic */ DivStatePath this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivStatePath$statesString$2(DivStatePath divStatePath) {
        super(0);
        this.this$0 = divStatePath;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final String invoke() {
        String divId;
        String stateId;
        if (this.this$0.states.isEmpty()) {
            return String.valueOf(this.this$0.getTopLevelStateId());
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.this$0.getTopLevelStateId());
        sb.append('/');
        List<Pair> list = this.this$0.states;
        ArrayList arrayList = new ArrayList();
        for (Pair pair : list) {
            divId = DivStatePathKt.getDivId(pair);
            stateId = DivStatePathKt.getStateId(pair);
            CollectionsKt.addAll(arrayList, CollectionsKt.listOf((Object[]) new String[]{divId, stateId}));
        }
        sb.append(CollectionsKt.joinToString$default(arrayList, "/", null, null, 0, null, null, 62, null));
        return sb.toString();
    }
}
