package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.Binding;
import xyz.block.protos.genie.EasingCurve;
import xyz.block.protos.genie.FormatStringOp;
import xyz.block.protos.genie.KeyPath;
import xyz.block.protos.genie.SetViewStateValue;
import xyz.block.protos.genie.UnaryOp;

/* loaded from: classes10.dex */
public final class CollectionMutation extends Message {
    public static final ProtoAdapter ADAPTER = new CollectionMutation$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CollectionMutation.class), "type.googleapis.com/xyz.block.genie.v1.CollectionMutation", Syntax.PROTO_2, null, "xyz/block/genie/v1/action.proto");
    public final AppendItem append;
    public final RemoveItems remove;
    public final RemoveAll remove_all;
    public final KeyPath target;
    public final UpdateItem update;

    public final class AppendItem extends Message {
        public static final ProtoAdapter ADAPTER = new CollectionMutation$AppendItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AppendItem.class), "type.googleapis.com/xyz.block.genie.v1.CollectionMutation.AppendItem", Syntax.PROTO_2, null, "xyz/block/genie/v1/action.proto");
        public final List fields;
        public final CollectionItem item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppendItem(CollectionItem collectionItem, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.item = collectionItem;
            this.fields = TransactorKt.immutableCopyOf("fields", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AppendItem)) {
                return false;
            }
            AppendItem appendItem = (AppendItem) obj;
            return Intrinsics.areEqual(unknownFields(), appendItem.unknownFields()) && Intrinsics.areEqual(this.item, appendItem.item) && Intrinsics.areEqual(this.fields, appendItem.fields);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            CollectionItem collectionItem = this.item;
            int hashCode2 = this.fields.hashCode() + ((hashCode + (collectionItem != null ? collectionItem.hashCode() : 0)) * 37);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UnaryOp.Builder builder = new UnaryOp.Builder(2);
            builder.operator_ = this.item;
            builder.operand = this.fields;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            CollectionItem collectionItem = this.item;
            if (collectionItem != null) {
                arrayList.add("item=" + collectionItem);
            }
            List list = this.fields;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("fields=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AppendItem{", "}", 0, null, null, 56);
        }
    }

    public final class RemoveAll extends Message {
        public static final ProtoAdapter ADAPTER = new CollectionMutation$RemoveAll$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RemoveAll.class), "type.googleapis.com/xyz.block.genie.v1.CollectionMutation.RemoveAll", Syntax.PROTO_2, null, "xyz/block/genie/v1/action.proto");

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoveAll(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof RemoveAll) && Intrinsics.areEqual(unknownFields(), ((RemoveAll) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            EasingCurve.EaseIn.Builder builder = new EasingCurve.EaseIn.Builder(19);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "RemoveAll{}";
        }
    }

    public final class RemoveItems extends Message {
        public static final ProtoAdapter ADAPTER = new CollectionMutation$RemoveItems$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RemoveItems.class), "type.googleapis.com/xyz.block.genie.v1.CollectionMutation.RemoveItems", Syntax.PROTO_2, null, "xyz/block/genie/v1/action.proto");
        public final List item_ids;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoveItems(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.item_ids = TransactorKt.immutableCopyOf("item_ids", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RemoveItems)) {
                return false;
            }
            RemoveItems removeItems = (RemoveItems) obj;
            return Intrinsics.areEqual(unknownFields(), removeItems.unknownFields()) && Intrinsics.areEqual(this.item_ids, removeItems.item_ids);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.item_ids.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            KeyPath.Builder builder = new KeyPath.Builder(3);
            builder.segments = this.item_ids;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.item_ids;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("item_ids=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "RemoveItems{", "}", 0, null, null, 56);
        }
    }

    public final class SetItemField extends Message {
        public static final ProtoAdapter ADAPTER = new CollectionMutation$SetItemField$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SetItemField.class), "type.googleapis.com/xyz.block.genie.v1.CollectionMutation.SetItemField", Syntax.PROTO_2, null, "xyz/block/genie/v1/action.proto");
        public final KeyPath key_path;
        public final Expression value_;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetItemField(KeyPath keyPath, Expression expression, ByteString byteString) {
            super(ADAPTER, byteString);
            keyPath.getClass();
            expression.getClass();
            byteString.getClass();
            this.key_path = keyPath;
            this.value_ = expression;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SetItemField)) {
                return false;
            }
            SetItemField setItemField = (SetItemField) obj;
            return Intrinsics.areEqual(unknownFields(), setItemField.unknownFields()) && Intrinsics.areEqual(this.key_path, setItemField.key_path) && Intrinsics.areEqual(this.value_, setItemField.value_);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.value_.hashCode() + ((this.key_path.hashCode() + (unknownFields().hashCode() * 37)) * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SetViewStateValue.Builder builder = new SetViewStateValue.Builder(1);
            builder.key_path = this.key_path;
            builder.value_ = this.value_;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("key_path=" + this.key_path);
            Matcher$$ExternalSyntheticOutline0.m("value_=", this.value_, arrayList);
            return CollectionsKt.joinToString$default(arrayList, ", ", "SetItemField{", "}", 0, null, null, 56);
        }
    }

    public final class UpdateItem extends Message {
        public static final ProtoAdapter ADAPTER = new CollectionMutation$UpdateItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UpdateItem.class), "type.googleapis.com/xyz.block.genie.v1.CollectionMutation.UpdateItem", Syntax.PROTO_2, null, "xyz/block/genie/v1/action.proto");
        public final List fields;
        public final Expression identity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateItem(List list, ByteString byteString, Expression expression) {
            super(ADAPTER, byteString);
            expression.getClass();
            list.getClass();
            byteString.getClass();
            this.identity = expression;
            this.fields = TransactorKt.immutableCopyOf("fields", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateItem)) {
                return false;
            }
            UpdateItem updateItem = (UpdateItem) obj;
            return Intrinsics.areEqual(unknownFields(), updateItem.unknownFields()) && Intrinsics.areEqual(this.identity, updateItem.identity) && Intrinsics.areEqual(this.fields, updateItem.fields);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.fields.hashCode() + Matcher$$ExternalSyntheticOutline0.m(this.identity, unknownFields().hashCode() * 37, 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            FormatStringOp.Builder builder = new FormatStringOp.Builder(3);
            builder.template = this.identity;
            builder.token_replacements = this.fields;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Matcher$$ExternalSyntheticOutline0.m("identity=", this.identity, arrayList);
            List list = this.fields;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("fields=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateItem{", "}", 0, null, null, 56);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionMutation(KeyPath keyPath, AppendItem appendItem, RemoveItems removeItems, RemoveAll removeAll, UpdateItem updateItem, ByteString byteString) {
        super(ADAPTER, byteString);
        keyPath.getClass();
        byteString.getClass();
        this.target = keyPath;
        this.append = appendItem;
        this.remove = removeItems;
        this.remove_all = removeAll;
        this.update = updateItem;
        if (TransactorKt.countNonNull(appendItem, removeItems, removeAll, updateItem, new Object[0]) <= 1) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("At most one of append, remove, remove_all, update may be non-null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CollectionMutation)) {
            return false;
        }
        CollectionMutation collectionMutation = (CollectionMutation) obj;
        return Intrinsics.areEqual(unknownFields(), collectionMutation.unknownFields()) && Intrinsics.areEqual(this.target, collectionMutation.target) && Intrinsics.areEqual(this.append, collectionMutation.append) && Intrinsics.areEqual(this.remove, collectionMutation.remove) && Intrinsics.areEqual(this.remove_all, collectionMutation.remove_all) && Intrinsics.areEqual(this.update, collectionMutation.update);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (this.target.hashCode() + (unknownFields().hashCode() * 37)) * 37;
        AppendItem appendItem = this.append;
        int hashCode2 = (hashCode + (appendItem != null ? appendItem.hashCode() : 0)) * 37;
        RemoveItems removeItems = this.remove;
        int hashCode3 = (hashCode2 + (removeItems != null ? removeItems.hashCode() : 0)) * 37;
        RemoveAll removeAll = this.remove_all;
        int hashCode4 = (hashCode3 + (removeAll != null ? removeAll.hashCode() : 0)) * 37;
        UpdateItem updateItem = this.update;
        int hashCode5 = hashCode4 + (updateItem != null ? updateItem.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Binding.Builder builder = new Binding.Builder(29);
        builder.key_path = this.target;
        builder.get_transform = this.append;
        builder.set_transform = this.remove;
        builder.validation = this.remove_all;
        builder.on_invalid = this.update;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("target=" + this.target);
        AppendItem appendItem = this.append;
        if (appendItem != null) {
            arrayList.add("append=" + appendItem);
        }
        RemoveItems removeItems = this.remove;
        if (removeItems != null) {
            arrayList.add("remove=" + removeItems);
        }
        RemoveAll removeAll = this.remove_all;
        if (removeAll != null) {
            arrayList.add("remove_all=" + removeAll);
        }
        UpdateItem updateItem = this.update;
        if (updateItem != null) {
            arrayList.add("update=" + updateItem);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CollectionMutation{", "}", 0, null, null, 56);
    }
}
