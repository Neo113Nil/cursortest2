package retrofit2;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.MathUtilsKt;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.work.impl.WorkLauncherImpl;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Headers;
import okhttp3.MediaType;

/* loaded from: classes3.dex */
public final class RequestFactory {
    public final Object baseUrl;
    public final Object contentType;
    public boolean hasBody;
    public final Object headers;
    public final Object httpMethod;
    public boolean isFormEncoded;
    public boolean isKotlinSuspendFunction;
    public boolean isMultipart;
    public final Object method;
    public final Object parameterHandlers;
    public Object relativeUrl;
    public final Object service;

    public final class Builder {
        public MediaType contentType;
        public boolean gotBody;
        public boolean gotField;
        public boolean gotPart;
        public boolean gotPath;
        public boolean gotQuery;
        public boolean gotQueryMap;
        public boolean gotQueryName;
        public boolean gotUrl;
        public boolean hasBody;
        public Headers headers;
        public String httpMethod;
        public boolean isFormEncoded;
        public boolean isKotlinSuspendFunction;
        public boolean isMultipart;
        public final Method method;
        public final Annotation[] methodAnnotations;
        public final Annotation[][] parameterAnnotationsArray;
        public Utils[] parameterHandlers;
        public final Type[] parameterTypes;
        public String relativeUrl;
        public LinkedHashSet relativeUrlParamNames;
        public final Retrofit retrofit;
        public final Class service;
        public static final Pattern PARAM_URL_REGEX = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        public static final Pattern PARAM_NAME_REGEX = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        public Builder(Retrofit retrofit, Class cls, Method method) {
            this.retrofit = retrofit;
            this.service = cls;
            this.method = method;
            this.methodAnnotations = method.getAnnotations();
            this.parameterTypes = method.getGenericParameterTypes();
            this.parameterAnnotationsArray = method.getParameterAnnotations();
        }

        public static Class boxIfPrimitive(Class cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        public final void parseHttpMethodAndPath(String str, String str2, boolean z) {
            String str3 = this.httpMethod;
            Method method = this.method;
            if (str3 != null) {
                throw Utils.methodError(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.httpMethod = str;
            this.hasBody = z;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            Pattern pattern = PARAM_URL_REGEX;
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (pattern.matcher(substring).find()) {
                    throw Utils.methodError(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                }
            }
            this.relativeUrl = str2;
            Matcher matcher = pattern.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            this.relativeUrlParamNames = linkedHashSet;
        }

        public final void validateResolvableType(int i, Type type2) {
            if (Utils.hasUnresolvableType(type2)) {
                throw Utils.parameterError(this.method, i, "Parameter type must not include a type variable or wildcard: %s", type2);
            }
        }
    }

    public RequestFactory(Builder builder) {
        this.service = builder.service;
        this.method = builder.method;
        this.baseUrl = builder.retrofit.baseUrl;
        this.httpMethod = builder.httpMethod;
        this.relativeUrl = builder.relativeUrl;
        this.headers = builder.headers;
        this.contentType = builder.contentType;
        this.hasBody = builder.hasBody;
        this.isFormEncoded = builder.isFormEncoded;
        this.isMultipart = builder.isMultipart;
        this.parameterHandlers = builder.parameterHandlers;
        this.isKotlinSuspendFunction = builder.isKotlinSuspendFunction;
    }

    public CursorAnchorInfo calculateCursorAnchorInfo() {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates decoratorNodeCoordinates;
        TextLayoutResult layoutResult;
        Matrix matrix = (Matrix) this.parameterHandlers;
        float[] fArr = (float[]) this.contentType;
        TextLayoutState textLayoutState = (TextLayoutState) this.method;
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            if (!textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null && (layoutCoordinates = (LayoutCoordinates) textLayoutState.coreNodeCoordinates$delegate.getValue()) != null) {
                if (!layoutCoordinates.isAttached()) {
                    layoutCoordinates = null;
                }
                if (layoutCoordinates != null && (decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates()) != null) {
                    if (!decoratorNodeCoordinates.isAttached()) {
                        decoratorNodeCoordinates = null;
                    }
                    if (decoratorNodeCoordinates != null && (layoutResult = textLayoutState.getLayoutResult()) != null) {
                        TextFieldCharSequence visualText = ((TransformedTextFieldState) this.service).getVisualText();
                        androidx.compose.ui.graphics.Matrix.m702resetimpl(fArr);
                        textLayoutNodeCoordinates.mo846transformToScreen58bKbWc(fArr);
                        ColorKt.m691setFromEL8BTi8(matrix, fArr);
                        return MathUtilsKt.m393buildvxqZcH0((CursorAnchorInfo.Builder) this.headers, visualText, visualText.selection, visualText.composition, layoutResult, matrix, SimpleLayoutKt.visibleBounds(layoutCoordinates).m637translatek4lQ0M(textLayoutNodeCoordinates.mo839localPositionOfR5De75A(layoutCoordinates, 0L)), SimpleLayoutKt.visibleBounds(decoratorNodeCoordinates).m637translatek4lQ0M(textLayoutNodeCoordinates.mo839localPositionOfR5De75A(decoratorNodeCoordinates, 0L)), this.hasBody, this.isFormEncoded, this.isMultipart, this.isKotlinSuspendFunction);
                    }
                }
            }
        }
        return null;
    }

    public RequestFactory(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, WorkLauncherImpl workLauncherImpl, CoroutineScope coroutineScope) {
        this.service = transformedTextFieldState;
        this.method = textLayoutState;
        this.baseUrl = workLauncherImpl;
        this.httpMethod = coroutineScope;
        this.headers = new CursorAnchorInfo.Builder();
        this.contentType = androidx.compose.ui.graphics.Matrix.m699constructorimpl$default();
        this.parameterHandlers = new Matrix();
    }
}
