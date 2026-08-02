package okhttp3.internal.concurrent;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.investing.backend.api.data.Category;
import com.squareup.cash.investing.backend.api.data.FilterDetails;
import com.squareup.cash.investing.presenters.categories.SelectionState;
import com.squareup.cash.investing.primitives.FilterToken;
import com.squareup.protos.franklin.common.SyncInvestmentCategory;
import com.squareup.protos.franklin.common.SyncInvestmentFilterGroup;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class TaskLoggerKt {
    public static final String formatDuration(long j) {
        String m;
        if (j <= -999500000) {
            m = CameraState$Type$EnumUnboxingLocalUtility.m((j - 500000000) / 1000000000, " s ", new StringBuilder());
        } else if (j <= -999500) {
            m = CameraState$Type$EnumUnboxingLocalUtility.m((j - 500000) / 1000000, " ms", new StringBuilder());
        } else if (j <= 0) {
            m = CameraState$Type$EnumUnboxingLocalUtility.m((j - 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500) {
            m = CameraState$Type$EnumUnboxingLocalUtility.m((j + 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500000) {
            m = CameraState$Type$EnumUnboxingLocalUtility.m((j + 500000) / 1000000, " ms", new StringBuilder());
        } else {
            m = CameraState$Type$EnumUnboxingLocalUtility.m((j + 500000000) / 1000000000, " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{m}, 1));
    }

    public static final String getTokenByType(FilterDetails[] filterDetailsArr, SyncInvestmentCategory.CategoryType categoryType) {
        FilterDetails filterDetails;
        FilterToken token;
        int length = filterDetailsArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                filterDetails = null;
                break;
            }
            filterDetails = filterDetailsArr[i];
            if (filterDetails.getType() == categoryType) {
                break;
            }
            i++;
        }
        if (filterDetails == null || (token = filterDetails.getToken()) == null) {
            return null;
        }
        return token.value;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x008b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String trackApplyFilterCdfEvent$toCdfString(SelectionState selectionState, FilterDetails[] filterDetailsArr, SyncInvestmentCategory.CategoryType categoryType) {
        FilterDetails filterDetails;
        String str;
        Object obj;
        FilterDetails filterDetails2;
        Object obj2;
        List list;
        Object obj3;
        int i = 0;
        String str2 = null;
        if (selectionState instanceof SelectionState.GroupedSingleSelect) {
            Collection values = ((SelectionState.GroupedSingleSelect) selectionState).groups.values();
            int length = filterDetailsArr.length;
            while (true) {
                if (i >= length) {
                    filterDetails2 = null;
                    break;
                }
                filterDetails2 = filterDetailsArr[i];
                if (filterDetails2.getType() == categoryType) {
                    break;
                }
                i++;
            }
            if (filterDetails2 != null) {
                if (filterDetails2 instanceof FilterDetails.Subfilters) {
                    Iterator it = ((FilterDetails.Subfilters) filterDetails2).mapNodes.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (CollectionsKt.contains(values, ((SyncInvestmentFilterGroup.CategoryMapNode) obj2).option_token)) {
                            break;
                        }
                    }
                    SyncInvestmentFilterGroup.CategoryMapNode categoryMapNode = (SyncInvestmentFilterGroup.CategoryMapNode) obj2;
                    if (categoryMapNode != null && (list = categoryMapNode.sub_nodes) != null) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it2.next();
                            if (CollectionsKt.contains(values, ((SyncInvestmentFilterGroup.CategoryMapNode) obj3).option_token)) {
                                break;
                            }
                        }
                        SyncInvestmentFilterGroup.CategoryMapNode categoryMapNode2 = (SyncInvestmentFilterGroup.CategoryMapNode) obj3;
                        if (categoryMapNode2 != null) {
                            return categoryMapNode2.category_token;
                        }
                    }
                }
                return null;
            }
        } else {
            if (!(selectionState instanceof SelectionState.MultiSelect)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            Set<String> set = ((SelectionState.MultiSelect) selectionState).tokens;
            ArrayList arrayList = new ArrayList();
            for (String str3 : set) {
                int length2 = filterDetailsArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        filterDetails = null;
                        break;
                    }
                    filterDetails = filterDetailsArr[i2];
                    if (filterDetails.getType() == categoryType) {
                        break;
                    }
                    i2++;
                }
                if (filterDetails != null) {
                    if (!(filterDetails instanceof FilterDetails.Categories)) {
                        if (!(filterDetails instanceof FilterDetails.Subfilters)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Iterator it3 = ((FilterDetails.Subfilters) filterDetails).subfilters.iterator();
                        while (it3.hasNext()) {
                            for (SyncInvestmentFilterGroup.SubfilterOption subfilterOption : ((SyncInvestmentFilterGroup.Subfilter) it3.next()).options) {
                                if (Intrinsics.areEqual(subfilterOption.token, str3)) {
                                    str = subfilterOption.token;
                                    break;
                                }
                            }
                        }
                    } else {
                        Iterator it4 = ((FilterDetails.Categories) filterDetails).categories.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it4.next();
                            if (Intrinsics.areEqual(((Category) obj).token.value, str3)) {
                                break;
                            }
                        }
                        Category category = (Category) obj;
                        if (category != null) {
                            str = category.name;
                        }
                    }
                    if (str == null) {
                        arrayList.add(str);
                    }
                }
                str = null;
                if (str == null) {
                }
            }
            str2 = CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62);
        }
        return Strings.emptyAsNull(str2);
    }
}
