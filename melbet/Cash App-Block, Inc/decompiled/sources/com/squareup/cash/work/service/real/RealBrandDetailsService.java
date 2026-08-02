package com.squareup.cash.work.service.real;

import app.cash.api.ApiResult;
import app.cash.local.service.LocalService;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.work.service.api.BrandDetails;
import com.squareup.cash.work.service.api.ThemedColor;
import com.squareup.cash.work.service.api.ThemedImage;
import com.squareup.protos.cash.local.client.app.v1.GetStaffBrandDetailsRequest;
import com.squareup.protos.cash.local.client.app.v1.GetStaffBrandDetailsResponse;
import com.squareup.protos.cash.local.client.app.v1.StaffBrandDetails;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealBrandDetailsService {
    public final LocalService localService;

    public RealBrandDetailsService(LocalService localService) {
        this.localService = localService;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchBrandDetails(List list, ContinuationImpl continuationImpl) {
        RealBrandDetailsService$fetchBrandDetails$1 realBrandDetailsService$fetchBrandDetails$1;
        int i;
        ApiResult apiResult;
        ThemedImage themedImage;
        BrandDetails brandDetails;
        if (continuationImpl instanceof RealBrandDetailsService$fetchBrandDetails$1) {
            realBrandDetailsService$fetchBrandDetails$1 = (RealBrandDetailsService$fetchBrandDetails$1) continuationImpl;
            int i2 = realBrandDetailsService$fetchBrandDetails$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBrandDetailsService$fetchBrandDetails$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realBrandDetailsService$fetchBrandDetails$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBrandDetailsService$fetchBrandDetails$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (list.isEmpty()) {
                        EmptyMap emptyMap = EmptyMap.INSTANCE;
                        emptyMap.getClass();
                        return new ApiResult.Success(emptyMap);
                    }
                    GetStaffBrandDetailsRequest getStaffBrandDetailsRequest = new GetStaffBrandDetailsRequest(list, ByteString.EMPTY);
                    realBrandDetailsService$fetchBrandDetails$1.label = 1;
                    obj = this.localService.getStaffBrandDetails(getStaffBrandDetailsRequest, realBrandDetailsService$fetchBrandDetails$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    if ((apiResult instanceof ApiResult.Failure.HttpFailure) || (apiResult instanceof ApiResult.Failure.NetworkFailure)) {
                        return apiResult;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                Map map = ((GetStaffBrandDetailsResponse) ((ApiResult.Success) apiResult).response).brand_details;
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    StaffBrandDetails staffBrandDetails = (StaffBrandDetails) entry.getValue();
                    LocalColor localColor = staffBrandDetails.foreground_color;
                    LocalColor localColor2 = staffBrandDetails.brand_card_outline_color;
                    LocalImage localImage = staffBrandDetails.artwork_image;
                    LocalColor localColor3 = staffBrandDetails.background_color;
                    if (localColor == null && localColor3 == null && localImage == null && localColor2 == null) {
                        brandDetails = null;
                    } else {
                        ThemedColor themedColor = localColor != null ? new ThemedColor(localColor.light_color, localColor.dark_color) : null;
                        ThemedColor themedColor2 = localColor3 != null ? new ThemedColor(localColor3.light_color, localColor3.dark_color) : null;
                        if (localImage != null) {
                            String str2 = localImage.light_url;
                            String str3 = localImage.dark_url;
                            Long l = localImage.width;
                            Integer valueOf = l != null ? Integer.valueOf((int) l.longValue()) : null;
                            Long l2 = localImage.height;
                            themedImage = new ThemedImage(str2, str3, valueOf, l2 != null ? Integer.valueOf((int) l2.longValue()) : null);
                        } else {
                            themedImage = null;
                        }
                        brandDetails = new BrandDetails(themedColor, themedColor2, themedImage, localColor2 != null ? new ThemedColor(localColor2.light_color, localColor2.dark_color) : null);
                    }
                    Pair pair = brandDetails != null ? new Pair(str, brandDetails) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return new ApiResult.Success(MapsKt__MapsKt.toMap(arrayList));
            }
        }
        realBrandDetailsService$fetchBrandDetails$1 = new RealBrandDetailsService$fetchBrandDetails$1(this, continuationImpl);
        Object obj2 = realBrandDetailsService$fetchBrandDetails$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBrandDetailsService$fetchBrandDetails$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }
}
