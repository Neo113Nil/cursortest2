package retrofit2.adapter.rxjava3;

import androidx.media3.extractor.text.CueEncoder;
import androidx.room.CoroutinesRoom;
import bo.app.a$$ExternalSyntheticBUOutline0;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import retrofit2.CallAdapter;
import retrofit2.Response;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public final class RxJava3CallAdapterFactory extends CallAdapter.Factory {
    @Override // retrofit2.CallAdapter.Factory
    public final CallAdapter get(Type type2, Annotation[] annotationArr, Retrofit retrofit) {
        Type type3;
        boolean z;
        boolean z2;
        Class<?> rawType = CallAdapter.Factory.getRawType(type2);
        if (rawType == CueEncoder.class) {
            return new RxJava3CallAdapter(Void.class, false, true, false, false, false, true);
        }
        boolean z3 = rawType == Flowable.class;
        boolean z4 = rawType == Single.class;
        boolean z5 = rawType == CoroutinesRoom.Companion.class;
        if (rawType != Observable.class && !z3 && !z4 && !z5) {
            return null;
        }
        if (!(type2 instanceof ParameterizedType)) {
            String str = !z3 ? !z4 ? z5 ? "Maybe" : "Observable" : "Single" : "Flowable";
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) type2);
        Class<?> rawType2 = CallAdapter.Factory.getRawType(parameterUpperBound);
        if (rawType2 == Response.class) {
            if (!(parameterUpperBound instanceof ParameterizedType)) {
                a$$ExternalSyntheticBUOutline0.m$1("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
                return null;
            }
            type3 = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
            z2 = false;
            z = false;
        } else if (rawType2 != Result.class) {
            type3 = parameterUpperBound;
            z = true;
            z2 = false;
        } else {
            if (!(parameterUpperBound instanceof ParameterizedType)) {
                a$$ExternalSyntheticBUOutline0.m$1("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
                return null;
            }
            type3 = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
            z2 = true;
            z = false;
        }
        return new RxJava3CallAdapter(type3, z2, z, z3, z4, z5, false);
    }
}
