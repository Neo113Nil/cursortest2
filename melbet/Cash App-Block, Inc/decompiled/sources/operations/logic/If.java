package operations.logic;

import com.nimbusds.jose.util.X509CertUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import operation.StandardLogicOperation;
import type.JsonLogicList;
import utils.AnyUtilsKt;

/* loaded from: classes9.dex */
public final class If implements StandardLogicOperation {
    public final /* synthetic */ int $r8$classId;
    public static final If INSTANCE$1 = new If(1);
    public static final If INSTANCE$2 = new If(2);
    public static final If INSTANCE = new If(0);
    public static final If INSTANCE$3 = new If(3);
    public static final If INSTANCE$4 = new If(4);

    public /* synthetic */ If(int i) {
        this.$r8$classId = i;
    }

    public static Object recursiveIf(List list) {
        int size = list.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return CollectionsKt.firstOrNull(list);
        }
        if (size != 2) {
            return size != 3 ? X509CertUtils.unwrapValueAsBoolean(CollectionsKt.firstOrNull(list)) ? CollectionsKt.getOrNull(1, list) : recursiveIf(list.subList(2, list.size())) : X509CertUtils.unwrapValueAsBoolean(CollectionsKt.firstOrNull(list)) ? CollectionsKt.getOrNull(1, list) : CollectionsKt.getOrNull(2, list);
        }
        if (X509CertUtils.unwrapValueAsBoolean(CollectionsKt.firstOrNull(list))) {
            return CollectionsKt.getOrNull(1, list);
        }
        return null;
    }

    @Override // operation.StandardLogicOperation
    public final Object evaluateLogic(Object obj, Object obj2) {
        Object obj3 = null;
        switch (this.$r8$classId) {
            case 0:
                return recursiveIf(AnyUtilsKt.getAsList(obj));
            case 1:
                JsonLogicList asList = AnyUtilsKt.getAsList(obj);
                List list = asList.items;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!(it.next() instanceof Boolean)) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next = it2.next();
                                    if (!X509CertUtils.unwrapValueAsBoolean(next)) {
                                        obj3 = next;
                                    }
                                }
                            }
                            return obj3 == null ? CollectionsKt.last((List) asList) : obj3;
                        }
                    }
                }
                if (!list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        if (!X509CertUtils.unwrapValueAsBoolean(it3.next())) {
                            return Boolean.valueOf(r6);
                        }
                    }
                }
                r6 = true;
                return Boolean.valueOf(r6);
            case 2:
                return Boolean.valueOf(X509CertUtils.unwrapValueAsBoolean(CollectionsKt.firstOrNull((List) AnyUtilsKt.getAsList(obj))));
            case 3:
                return Boolean.valueOf(!X509CertUtils.unwrapValueAsBoolean(CollectionsKt.firstOrNull((List) AnyUtilsKt.getAsList(obj))));
            default:
                JsonLogicList asList2 = AnyUtilsKt.getAsList(obj);
                List list2 = asList2.items;
                if (!list2.isEmpty()) {
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        if (!(it4.next() instanceof Boolean)) {
                            Iterator it5 = list2.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    Object next2 = it5.next();
                                    if (X509CertUtils.unwrapValueAsBoolean(next2)) {
                                        obj3 = next2;
                                    }
                                }
                            }
                            return obj3 == null ? CollectionsKt.last((List) asList2) : obj3;
                        }
                    }
                }
                Iterator it6 = list2.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        Object next3 = it6.next();
                        if (X509CertUtils.unwrapValueAsBoolean(next3)) {
                            obj3 = next3;
                        }
                    }
                }
                return Boolean.valueOf(obj3 != null);
        }
    }
}
