package kotlin.reflect.jvm.internal;

import androidx.room.Room;
import androidx.room.RoomDatabase$closeBarrier$1;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.calls.Caller;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public abstract class ReflectKCallableImpl implements ReflectKCallable {
    public final ReflectProperties$LazySoftVal _absentArguments = TuplesKt.lazySoft(null, new RoomDatabase$closeBarrier$1(0, this, Room.class, "computeAbsentArguments", "computeAbsentArguments(Lkotlin/reflect/jvm/internal/ReflectKCallable;)[Ljava/lang/Object;", 1, 14));

    @Override // kotlin.reflect.KCallable
    public final Object call(Object... objArr) {
        objArr.getClass();
        try {
            return getCaller().call(objArr);
        } catch (IllegalAccessException e) {
            throw new IllegalCallableAccessException(e);
        }
    }

    @Override // kotlin.reflect.KCallable
    public final Object callBy(Map map) {
        Object defaultEmptyArray;
        map.getClass();
        boolean z = false;
        if (Room.isAnnotationConstructor(this)) {
            List<ReflectKParameter> parameters = getParameters();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters, 10));
            for (ReflectKParameter reflectKParameter : parameters) {
                if (map.containsKey(reflectKParameter)) {
                    defaultEmptyArray = map.get(reflectKParameter);
                    if (defaultEmptyArray == null) {
                        Path$$ExternalSyntheticBUOutline0.m("Annotation argument value cannot be null (", 41, reflectKParameter);
                        return null;
                    }
                } else if (reflectKParameter.isOptional()) {
                    defaultEmptyArray = null;
                } else {
                    if (!reflectKParameter.isVararg()) {
                        OptionalProvider$$ExternalSyntheticLambda0.m((Object) reflectKParameter, "No argument provided for a required parameter: ");
                        return null;
                    }
                    defaultEmptyArray = Room.defaultEmptyArray(reflectKParameter.getType());
                }
                arrayList.add(defaultEmptyArray);
            }
            Caller defaultCaller = getDefaultCaller();
            if (defaultCaller != null) {
                try {
                    return defaultCaller.call(arrayList.toArray(new Object[0]));
                } catch (IllegalAccessException e) {
                    throw new IllegalCallableAccessException(e);
                }
            }
            throw new KotlinReflectionInternalError("This callable does not support a default call: " + this);
        }
        List<ReflectKParameter> parameters2 = getParameters();
        if (parameters2.isEmpty()) {
            try {
                return getCaller().call(isSuspend() ? new Continuation[]{null} : new Continuation[0]);
            } catch (IllegalAccessException e2) {
                throw new IllegalCallableAccessException(e2);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters2.size();
        Object[] objArr = (Object[]) ((Object[]) this._absentArguments.invoke()).clone();
        if (isSuspend()) {
            objArr[parameters2.size()] = null;
        }
        int i = 0;
        for (ReflectKParameter reflectKParameter2 : parameters2) {
            if (map.containsKey(reflectKParameter2)) {
                objArr[reflectKParameter2.getIndex()] = map.get(reflectKParameter2);
            } else if (reflectKParameter2.isOptional()) {
                int i2 = (i / 32) + size;
                Object obj = objArr[i2];
                obj.getClass();
                objArr[i2] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i % 32)));
                z = true;
            } else if (!reflectKParameter2.isVararg()) {
                OptionalProvider$$ExternalSyntheticLambda0.m((Object) reflectKParameter2, "No argument provided for a required parameter: ");
                return null;
            }
            if (reflectKParameter2.getKind() == KParameter$Kind.VALUE || reflectKParameter2.getKind() == KParameter$Kind.CONTEXT) {
                i++;
            }
        }
        if (!z) {
            try {
                return getCaller().call(Arrays.copyOf(objArr, size));
            } catch (IllegalAccessException e3) {
                throw new IllegalCallableAccessException(e3);
            }
        }
        Caller defaultCaller2 = getDefaultCaller();
        if (defaultCaller2 != null) {
            try {
                return defaultCaller2.call(objArr);
            } catch (IllegalAccessException e4) {
                throw new IllegalCallableAccessException(e4);
            }
        }
        throw new KotlinReflectionInternalError("This callable does not support a default call: " + this);
    }
}
