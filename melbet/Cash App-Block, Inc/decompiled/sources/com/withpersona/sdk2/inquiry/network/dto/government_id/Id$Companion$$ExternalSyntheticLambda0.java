package com.withpersona.sdk2.inquiry.network.dto.government_id;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes9.dex */
public final /* synthetic */ class Id$Companion$$ExternalSyntheticLambda0 implements JsonAdapter.Factory {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Id$Companion$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // com.squareup.moshi.JsonAdapter.Factory
    public final JsonAdapter create(Type type2, Set set, Moshi moshi) {
        JsonAdapter createAdapter$lambda$0;
        JsonAdapter createAdapter$lambda$02;
        switch (this.$r8$classId) {
            case 0:
                createAdapter$lambda$0 = Id.Companion.createAdapter$lambda$0(type2, set, moshi);
                return createAdapter$lambda$0;
            default:
                createAdapter$lambda$02 = LocalImage.Companion.createAdapter$lambda$0(type2, set, moshi);
                return createAdapter$lambda$02;
        }
    }
}
