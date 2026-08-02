package operations;

import com.squareup.cash.investing.primitives.InvestingState;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import utils.AnyUtilsKt;

/* loaded from: classes9.dex */
public interface ComparingOperation {

    public abstract class DefaultImpls {
        public static boolean compareListOfTwo(ComparingOperation comparingOperation, List list, Function2 function2) {
            if (list != null) {
                ArrayList comparableList = AnyUtilsKt.getComparableList(list);
                List unwrapAsComparable = comparingOperation.unwrapAsComparable((Comparable) CollectionsKt.firstOrNull((List) comparableList), (Comparable) CollectionsKt.getOrNull(1, comparableList));
                Integer num = null;
                if (unwrapAsComparable != null) {
                    List list2 = unwrapAsComparable;
                    boolean z = list2 instanceof Collection;
                    if (!z || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (((Comparable) it.next()) != null) {
                                if (!z || !list2.isEmpty()) {
                                    Iterator it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        if (((Comparable) it2.next()) == null) {
                                            break;
                                        }
                                    }
                                }
                                num = Integer.valueOf(ComparisonsKt__ComparisonsKt.compareValues((Comparable) CollectionsKt.firstOrNull(unwrapAsComparable), (Comparable) CollectionsKt.getOrNull(1, unwrapAsComparable)));
                            }
                        }
                    }
                    num = Integer.valueOf(ComparisonsKt__ComparisonsKt.compareValues((Comparable) CollectionsKt.firstOrNull(unwrapAsComparable), (Comparable) CollectionsKt.getOrNull(1, unwrapAsComparable)));
                }
                if (num != null) {
                    return ((Boolean) function2.invoke(Integer.valueOf(num.intValue()), 0)).booleanValue();
                }
            }
            return false;
        }

        public static final boolean getNeedsApprovalToAccessInvestingFeatures(InvestingState.Content content) {
            content.getClass();
            return (content.brokerageAccountState instanceof InvestingState.Content.BrokerageAccountState.Inactive) && content.isDependent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static List unwrapAsComparable(ComparingOperation comparingOperation, Comparable comparable, Comparable comparable2) {
            boolean z = comparable instanceof Number;
            return (z && (comparable2 instanceof Number)) ? CollectionsKt__CollectionsKt.listOf((Object[]) new Double[]{Double.valueOf(((Number) comparable).doubleValue()), Double.valueOf(((Number) comparable2).doubleValue())}) : ((comparable instanceof String) && (comparable2 instanceof Number)) ? CollectionsKt__CollectionsKt.listOf((Object[]) new Double[]{StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull((String) comparable), Double.valueOf(((Number) comparable2).doubleValue())}) : (z && (comparable2 instanceof String)) ? CollectionsKt__CollectionsKt.listOf((Object[]) new Double[]{Double.valueOf(((Number) comparable).doubleValue()), StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull((String) comparable2)}) : ((comparable instanceof Boolean) || (comparable2 instanceof Boolean)) ? CollectionsKt__CollectionsKt.listOf((Object[]) new Boolean[]{comparingOperation.unwrapValueAsBoolean(comparable), comparingOperation.unwrapValueAsBoolean(comparable2)}) : comparingOperation.unwrapAsComparableWithTypeSensitivity(comparable, comparable2);
        }

        public static List unwrapAsComparableWithTypeSensitivity(Comparable comparable, Comparable comparable2) {
            if (comparable != null && comparable2 != null && comparable.getClass() == comparable2.getClass()) {
                return CollectionsKt__CollectionsKt.listOf((Object[]) new Comparable[]{comparable, comparable2});
            }
            if (comparable == null && comparable2 == null) {
                return CollectionsKt__CollectionsKt.listOf((Object[]) new Comparable[]{comparable, comparable2});
            }
            return null;
        }

        public static Boolean unwrapValueAsBoolean(Object obj) {
            Double doubleOrNull;
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            if (obj instanceof Number) {
                return Boolean.valueOf(((Number) obj).longValue() > 0);
            }
            if (!(obj instanceof String) || (doubleOrNull = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull((String) obj)) == null) {
                return null;
            }
            return Boolean.valueOf(((long) doubleOrNull.doubleValue()) > 0);
        }

        public abstract Method getAccessor(Class cls, Field field);

        public abstract Constructor getCanonicalRecordConstructor(Class cls);

        public abstract String[] getRecordComponentNames(Class cls);

        public abstract boolean isRecord(Class cls);
    }

    boolean compareListOfTwo(List list, Function2 function2);

    List unwrapAsComparable(Comparable comparable, Comparable comparable2);

    List unwrapAsComparableWithTypeSensitivity(Comparable comparable, Comparable comparable2);

    Boolean unwrapValueAsBoolean(Comparable comparable);
}
