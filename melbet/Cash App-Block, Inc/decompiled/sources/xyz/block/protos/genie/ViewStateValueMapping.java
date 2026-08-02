package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.EasingCurve;
import xyz.block.protos.genie.OpenURL;
import xyz.block.protos.genie.TransitionEffect$Push;

/* loaded from: classes10.dex */
public final class ViewStateValueMapping extends Message {
    public static final ProtoAdapter ADAPTER = new ViewStateValueMapping$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ViewStateValueMapping.class), "type.googleapis.com/xyz.block.genie.v1.ViewStateValueMapping", Syntax.PROTO_2, null, "xyz/block/genie/v1/state.proto");
    public final KeyPath destination_key_path;
    public final String destination_view_slug;
    public final SceneInputs scene_inputs;
    public final Expression source_value;
    public final ViewOutputs view_outputs;

    public final class SceneInputs extends Message {
        public static final ProtoAdapter ADAPTER = new ViewStateValueMapping$SceneInputs$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SceneInputs.class), "type.googleapis.com/xyz.block.genie.v1.ViewStateValueMapping.SceneInputs", Syntax.PROTO_2, null, "xyz/block/genie/v1/state.proto");

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SceneInputs(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof SceneInputs) && Intrinsics.areEqual(unknownFields(), ((SceneInputs) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            TransitionEffect$Push.Builder builder = new TransitionEffect$Push.Builder(3);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "SceneInputs{}";
        }
    }

    public final class ViewOutputs extends Message {
        public static final ProtoAdapter ADAPTER = new ViewStateValueMapping$ViewOutputs$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ViewOutputs.class), "type.googleapis.com/xyz.block.genie.v1.ViewStateValueMapping.ViewOutputs", Syntax.PROTO_2, null, "xyz/block/genie/v1/state.proto");
        public final String view_slug;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewOutputs(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            str.getClass();
            byteString.getClass();
            this.view_slug = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ViewOutputs)) {
                return false;
            }
            ViewOutputs viewOutputs = (ViewOutputs) obj;
            return Intrinsics.areEqual(unknownFields(), viewOutputs.unknownFields()) && Intrinsics.areEqual(this.view_slug, viewOutputs.view_slug);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.view_slug.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            OpenURL.Builder builder = new OpenURL.Builder(11);
            builder.url = this.view_slug;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            BalanceFeedKt$$ExternalSyntheticOutline0.m(this.view_slug, "view_slug=", arrayList);
            return CollectionsKt.joinToString$default(arrayList, ", ", "ViewOutputs{", "}", 0, null, null, 56);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewStateValueMapping(ViewOutputs viewOutputs, SceneInputs sceneInputs, Expression expression, String str, KeyPath keyPath, ByteString byteString) {
        super(ADAPTER, byteString);
        expression.getClass();
        keyPath.getClass();
        byteString.getClass();
        this.view_outputs = viewOutputs;
        this.scene_inputs = sceneInputs;
        this.source_value = expression;
        this.destination_view_slug = str;
        this.destination_key_path = keyPath;
        if (TransactorKt.countNonNull(viewOutputs, sceneInputs) <= 1) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("At most one of view_outputs, scene_inputs may be non-null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ViewStateValueMapping)) {
            return false;
        }
        ViewStateValueMapping viewStateValueMapping = (ViewStateValueMapping) obj;
        return Intrinsics.areEqual(unknownFields(), viewStateValueMapping.unknownFields()) && Intrinsics.areEqual(this.view_outputs, viewStateValueMapping.view_outputs) && Intrinsics.areEqual(this.scene_inputs, viewStateValueMapping.scene_inputs) && Intrinsics.areEqual(this.source_value, viewStateValueMapping.source_value) && Intrinsics.areEqual(this.destination_view_slug, viewStateValueMapping.destination_view_slug) && Intrinsics.areEqual(this.destination_key_path, viewStateValueMapping.destination_key_path);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ViewOutputs viewOutputs = this.view_outputs;
        int hashCode2 = (hashCode + (viewOutputs != null ? viewOutputs.hashCode() : 0)) * 37;
        SceneInputs sceneInputs = this.scene_inputs;
        int m = Matcher$$ExternalSyntheticOutline0.m(this.source_value, (hashCode2 + (sceneInputs != null ? sceneInputs.hashCode() : 0)) * 37, 37);
        String str = this.destination_view_slug;
        int hashCode3 = this.destination_key_path.hashCode() + ((m + (str != null ? str.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EasingCurve.Builder builder = new EasingCurve.Builder(2);
        builder.linear = this.view_outputs;
        builder.ease_in = this.scene_inputs;
        builder.ease_out = this.source_value;
        builder.ease_in_out = this.destination_view_slug;
        builder.cubic_bezier = this.destination_key_path;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ViewOutputs viewOutputs = this.view_outputs;
        if (viewOutputs != null) {
            arrayList.add("view_outputs=" + viewOutputs);
        }
        SceneInputs sceneInputs = this.scene_inputs;
        if (sceneInputs != null) {
            arrayList.add("scene_inputs=" + sceneInputs);
        }
        Matcher$$ExternalSyntheticOutline0.m("source_value=", this.source_value, arrayList);
        String str = this.destination_view_slug;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "destination_view_slug=", arrayList);
        }
        arrayList.add("destination_key_path=" + this.destination_key_path);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ViewStateValueMapping{", "}", 0, null, null, 56);
    }
}
