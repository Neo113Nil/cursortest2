package com.google.android.gms.games;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzg extends zzl {
    zzg() {
        super(null);
    }

    @Override // com.google.android.gms.common.api.Api.BaseClientBuilder
    public final /* synthetic */ List getImpliedScopes(Object obj) {
        return Collections.singletonList(Games.SCOPE_GAMES);
    }
}
