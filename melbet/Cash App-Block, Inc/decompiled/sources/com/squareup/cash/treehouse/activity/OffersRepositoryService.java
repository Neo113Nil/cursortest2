package com.squareup.cash.treehouse.activity;

import app.cash.zipline.ZiplineService;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmo;
import kotlin.coroutines.Continuation;
import okio.ByteString;

/* loaded from: classes.dex */
public interface OffersRepositoryService extends ZiplineService {
    Object getActiveOfferMerchantTokens(zzmo zzmoVar);

    Object saveSheetPreload(ByteString byteString, Continuation continuation);
}
