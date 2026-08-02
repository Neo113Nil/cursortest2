package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import type.JsonLogicList;
import utils.AnyUtilsKt;

/* loaded from: classes9.dex */
public abstract class JsonLogicResult implements CallbackToFutureAdapter$Resolver {

    public final class Success extends JsonLogicResult {
        public final Object value;

        public Success(Object obj) {
            this.value = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && this.value.equals(((Success) obj).value);
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Success(value=", ")", this.value);
        }
    }

    public static final LayerDrawable layerWith(Drawable drawable, Drawable drawable2) {
        drawable2.getClass();
        return new LayerDrawable(new Drawable[]{drawable, drawable2});
    }

    public static Double unwrap(Object obj) {
        Double valueOf = Double.valueOf(0.0d);
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (obj instanceof String) {
            return StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull((String) obj);
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = list.size();
            if (size != 0) {
                if (size != 1) {
                    return null;
                }
                return unwrap(CollectionsKt.first(list));
            }
        } else {
            if (obj instanceof Boolean) {
                return Double.valueOf(((Boolean) obj).booleanValue() ? 1.0d : 0.0d);
            }
            if (obj != null) {
                return null;
            }
        }
        return valueOf;
    }

    public static ArrayList unwrapValueAsDouble(Object obj) {
        JsonLogicList asList = AnyUtilsKt.getAsList(obj);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(asList, 10));
        Iterator it = asList.items.iterator();
        while (it.hasNext()) {
            arrayList.add(unwrap(it.next()));
        }
        return arrayList;
    }
}
