package com.withpersona.sdk2.inquiry.ui;

import android.content.Context;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentContainerConfig;
import dev.chrisbanes.haze.Pool;
import io.noties.markwon.MarkwonImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* loaded from: classes9.dex */
public final class ComponentWorkHelper {
    public final Pool addressAutocompleteWorker;
    public final MatchResult.Destructured addressDetailsWorker;
    public final Context applicationContext;
    public final MarkwonImpl fileSelectWorkerFactory;
    public final POPMatchingFactory silentNetworkAuthWorker;

    public ComponentWorkHelper(Context context, Pool pool, MatchResult.Destructured destructured, POPMatchingFactory pOPMatchingFactory, MarkwonImpl markwonImpl) {
        context.getClass();
        pool.getClass();
        destructured.getClass();
        pOPMatchingFactory.getClass();
        markwonImpl.getClass();
        this.applicationContext = context;
        this.addressAutocompleteWorker = pool;
        this.addressDetailsWorker = destructured;
        this.silentNetworkAuthWorker = pOPMatchingFactory;
        this.fileSelectWorkerFactory = markwonImpl;
    }

    public static UiComponentConfig findComponentConfig(String str, List list) {
        UiComponentConfig findComponentConfig;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UiComponentConfig uiComponentConfig = (UiComponentConfig) it.next();
            if (Intrinsics.areEqual(uiComponentConfig.getName(), str)) {
                return uiComponentConfig;
            }
            if ((uiComponentConfig instanceof UiComponentContainerConfig) && (findComponentConfig = findComponentConfig(str, ((UiComponentContainerConfig) uiComponentConfig).getChildren())) != null) {
                return findComponentConfig;
            }
        }
        return null;
    }

    public static List getComponentErrors(String str, String str2, List list, boolean z) {
        Object obj;
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((UiComponentError) obj).getName(), str)) {
                break;
            }
        }
        UiComponentError uiComponentError = (UiComponentError) obj;
        if (z) {
            return list;
        }
        if (uiComponentError instanceof UiComponentError.UiGovernmentIdNfcScanComponentError) {
            UiComponentError.UiGovernmentIdNfcScanComponentError uiGovernmentIdNfcScanComponentError = (UiComponentError.UiGovernmentIdNfcScanComponentError) uiComponentError;
            Map<String, String> message = uiGovernmentIdNfcScanComponentError.getMessage();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, String> entry : message.entrySet()) {
                if (!Intrinsics.areEqual(entry.getKey(), str2)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            uiGovernmentIdNfcScanComponentError.setMessage(linkedHashMap);
            return list;
        }
        if (!(uiComponentError instanceof UiComponentError.UiInputAddressComponentError)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (!Intrinsics.areEqual(((UiComponentError) obj2).getName(), str)) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
        UiComponentError.UiInputAddressComponentError uiInputAddressComponentError = (UiComponentError.UiInputAddressComponentError) uiComponentError;
        Map<String, String> message2 = uiInputAddressComponentError.getMessage();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, String> entry2 : message2.entrySet()) {
            if (!Intrinsics.areEqual(entry2.getKey(), str2)) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        uiInputAddressComponentError.setMessage(linkedHashMap2);
        return list;
    }

    public static /* synthetic */ List getComponentErrors$default(ComponentWorkHelper componentWorkHelper, boolean z, List list, String str) {
        componentWorkHelper.getClass();
        return getComponentErrors(str, null, list, z);
    }
}
