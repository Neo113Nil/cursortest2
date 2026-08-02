package dev.chrisbanes.haze;

import android.view.View;
import androidx.collection.LruCache;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.platform.AndroidComposeView;
import com.squareup.wire.ProtoAdapter;
import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonArraySerializer;
import kotlinx.serialization.json.JsonLiteralSerializer;
import kotlinx.serialization.json.JsonNullSerializer;
import kotlinx.serialization.json.JsonObjectSerializer;
import kotlinx.serialization.json.JsonPrimitiveSerializer;
import radiography.internal.CompositionContextsKt$REFLECTION_CONSTANTS$2$1;
import squareup.cash.analytics.CdfEvent$Parameters$Companion$ADAPTER$1;
import xyz.block.genie.expressions.ExpressionEvaluator;
import xyz.block.genie.state.GenieCompositionLocalsKt;
import xyz.block.genie.state.GenieRootViewState;

/* loaded from: classes9.dex */
public final /* synthetic */ class HazeStyleKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ HazeStyleKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ProtoAdapter valuesAdapter_delegate$lambda$0;
        Class<?> cls = null;
        switch (this.$r8$classId) {
            case 0:
                RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = HazeDefaults.blurredEdgeTreatment;
                long j = Color.Unspecified;
                HazeTint hazeTint = new HazeTint(j != 16 ? Color.m675copywmQWz5c$default(Color.m677getAlphaimpl(j) * 0.7f, j, 14) : j);
                HazeTint hazeTint2 = HazeTint.Unspecified;
                hazeTint2.getClass();
                return new HazeStyle(j, CollectionsKt__CollectionsJVMKt.listOf(hazeTint), 20.0f, 0.15f, hazeTint2);
            case 1:
                return Unit.INSTANCE;
            case 2:
                return Unit.INSTANCE;
            case 3:
                return Unit.INSTANCE;
            case 4:
                try {
                    cls = Class.forName("com.withpersona.sdk2.inquiry.webrtc.impl.WebRtcManager");
                } catch (ClassNotFoundException unused) {
                }
                return Boolean.valueOf(cls != null);
            case 5:
                return new HazeArea();
            case 6:
                return new LruCache(50);
            case 7:
                return Unit.INSTANCE;
            case 8:
                throw new SerializationException("It is not possible to retrieve an array serializer using KClass alone, use KType instead or ArraySerializer factory");
            case 9:
                return JsonPrimitiveSerializer.descriptor;
            case 10:
                return JsonNullSerializer.descriptor;
            case 11:
                return JsonLiteralSerializer.descriptor;
            case 12:
                return JsonObjectSerializer.descriptor;
            case 13:
                return JsonArraySerializer.descriptor;
            case 14:
                try {
                    Class cls2 = AndroidComposeView.systemPropertiesClass;
                    r0 = true;
                } catch (Throwable unused2) {
                }
                return Boolean.valueOf(r0);
            case 15:
                try {
                    Field declaredField = View.class.getDeclaredField("mKeyedTags");
                    declaredField.setAccessible(true);
                    return declaredField;
                } catch (NoSuchFieldException unused3) {
                    return null;
                }
            case 16:
                try {
                    return new CompositionContextsKt$REFLECTION_CONSTANTS$2$1();
                } catch (Throwable unused4) {
                    return null;
                }
            case 17:
                valuesAdapter_delegate$lambda$0 = CdfEvent$Parameters$Companion$ADAPTER$1.valuesAdapter_delegate$lambda$0();
                return valuesAdapter_delegate$lambda$0;
            case 18:
                return new GenieRootViewState(null);
            case 19:
                return new ExpressionEvaluator(null);
            default:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = GenieCompositionLocalsKt.LocalGenieViewState;
                return null;
        }
    }
}
