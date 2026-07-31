package com.onesignal.common.consistency;

import com.onesignal.common.consistency.enums.IamFetchRywTokenKey;
import com.onesignal.common.consistency.models.ICondition;
import com.onesignal.common.consistency.models.IConsistencyKeyEnum;
import com.onesignal.core.BuildConfig;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IamFetchReadyCondition.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J,\u0010\b\u001a\u0004\u0018\u00010\t2 \u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000b0\u000bH\u0016J(\u0010\r\u001a\u00020\u000e2\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b0\u000bH\u0016R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/onesignal/common/consistency/IamFetchReadyCondition;", "Lcom/onesignal/common/consistency/models/ICondition;", "key", "", "(Ljava/lang/String;)V", "id", "getId", "()Ljava/lang/String;", "getRywData", "Lcom/onesignal/common/consistency/RywData;", "indexedTokens", "", "Lcom/onesignal/common/consistency/models/IConsistencyKeyEnum;", "isMet", "", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IamFetchReadyCondition implements ICondition {
    public static final String ID = "IamFetchReadyCondition";
    private final String key;

    public IamFetchReadyCondition(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
    }

    @Override // com.onesignal.common.consistency.models.ICondition
    public String getId() {
        return ID;
    }

    @Override // com.onesignal.common.consistency.models.ICondition
    public boolean isMet(Map<String, ? extends Map<IConsistencyKeyEnum, RywData>> indexedTokens) {
        Intrinsics.checkNotNullParameter(indexedTokens, "indexedTokens");
        Map<IConsistencyKeyEnum, RywData> map = indexedTokens.get(this.key);
        return (map == null || map.get(IamFetchRywTokenKey.USER) == null) ? false : true;
    }

    @Override // com.onesignal.common.consistency.models.ICondition
    public RywData getRywData(Map<String, ? extends Map<IConsistencyKeyEnum, RywData>> indexedTokens) {
        Intrinsics.checkNotNullParameter(indexedTokens, "indexedTokens");
        Map<IConsistencyKeyEnum, RywData> map = indexedTokens.get(this.key);
        Object obj = null;
        if (map == null) {
            return null;
        }
        Iterator it = CollectionsKt.listOfNotNull((Object[]) new RywData[]{map.get(IamFetchRywTokenKey.USER), map.get(IamFetchRywTokenKey.SUBSCRIPTION)}).iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                String rywToken = ((RywData) obj).getRywToken();
                if (rywToken == null) {
                    rywToken = "";
                }
                String str = rywToken;
                do {
                    Object next = it.next();
                    String rywToken2 = ((RywData) next).getRywToken();
                    if (rywToken2 == null) {
                        rywToken2 = "";
                    }
                    String str2 = rywToken2;
                    if (str.compareTo(str2) < 0) {
                        obj = next;
                        str = str2;
                    }
                } while (it.hasNext());
            }
        }
        return (RywData) obj;
    }
}
