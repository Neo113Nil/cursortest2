package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.moneybot.genie.protos.MoneybotScaffold;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.CollectionLiteralField;
import xyz.block.protos.genie.CollectionMutation;

/* loaded from: classes10.dex */
public final class FormatStringOp extends Message {
    public static final ProtoAdapter ADAPTER = new FormatStringOp$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FormatStringOp.class), "type.googleapis.com/xyz.block.genie.v1.FormatStringOp", Syntax.PROTO_2, null, "xyz/block/genie/v1/expression.proto");
    public final Expression template;
    public final List token_replacements;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Expression template;
        public List token_replacements;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    Expression expression = this.template;
                    if (expression != null) {
                        return new FormatStringOp(this.token_replacements, buildUnknownFields(), expression);
                    }
                    TransactorKt.missingRequiredFields(expression, "template");
                    throw null;
                case 1:
                    return new ComposePlatform.Box(this.token_replacements, buildUnknownFields(), this.template);
                case 2:
                    Expression expression2 = this.template;
                    if (expression2 != null) {
                        return new MoneybotScaffold.Answer.Scenario(this.token_replacements, buildUnknownFields(), expression2);
                    }
                    TransactorKt.missingRequiredFields(expression2, "heading");
                    throw null;
                default:
                    Expression expression3 = this.template;
                    if (expression3 != null) {
                        return new CollectionMutation.UpdateItem(this.token_replacements, buildUnknownFields(), expression3);
                    }
                    TransactorKt.missingRequiredFields(expression3, "identity");
                    throw null;
            }
        }
    }

    public final class TokenReplacement extends Message {
        public static final ProtoAdapter ADAPTER = new FormatStringOp$TokenReplacement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TokenReplacement.class), "type.googleapis.com/xyz.block.genie.v1.FormatStringOp.TokenReplacement", Syntax.PROTO_2, null, "xyz/block/genie/v1/expression.proto");
        public final String key;
        public final Expression value_;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TokenReplacement(String str, Expression expression, ByteString byteString) {
            super(ADAPTER, byteString);
            str.getClass();
            expression.getClass();
            byteString.getClass();
            this.key = str;
            this.value_ = expression;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TokenReplacement)) {
                return false;
            }
            TokenReplacement tokenReplacement = (TokenReplacement) obj;
            return Intrinsics.areEqual(unknownFields(), tokenReplacement.unknownFields()) && Intrinsics.areEqual(this.key, tokenReplacement.key) && Intrinsics.areEqual(this.value_, tokenReplacement.value_);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.value_.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.key);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            CollectionLiteralField.Builder builder = new CollectionLiteralField.Builder(1);
            builder.key = this.key;
            builder.value_ = this.value_;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            BalanceFeedKt$$ExternalSyntheticOutline0.m(this.key, "key=", arrayList);
            Matcher$$ExternalSyntheticOutline0.m("value_=", this.value_, arrayList);
            return CollectionsKt.joinToString$default(arrayList, ", ", "TokenReplacement{", "}", 0, null, null, 56);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormatStringOp(List list, ByteString byteString, Expression expression) {
        super(ADAPTER, byteString);
        expression.getClass();
        list.getClass();
        byteString.getClass();
        this.template = expression;
        this.token_replacements = TransactorKt.immutableCopyOf("token_replacements", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FormatStringOp)) {
            return false;
        }
        FormatStringOp formatStringOp = (FormatStringOp) obj;
        return Intrinsics.areEqual(unknownFields(), formatStringOp.unknownFields()) && Intrinsics.areEqual(this.template, formatStringOp.template) && Intrinsics.areEqual(this.token_replacements, formatStringOp.token_replacements);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.token_replacements.hashCode() + Matcher$$ExternalSyntheticOutline0.m(this.template, unknownFields().hashCode() * 37, 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.template = this.template;
        builder.token_replacements = this.token_replacements;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Matcher$$ExternalSyntheticOutline0.m("template=", this.template, arrayList);
        List list = this.token_replacements;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("token_replacements=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FormatStringOp{", "}", 0, null, null, 56);
    }
}
