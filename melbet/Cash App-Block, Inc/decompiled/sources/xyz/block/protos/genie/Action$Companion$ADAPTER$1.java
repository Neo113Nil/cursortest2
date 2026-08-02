package xyz.block.protos.genie;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class Action$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Action((Navigate) obj, (SetViewStateValue) obj2, (OpenURL) obj3, (CompoundAction) obj4, (Submit) obj5, (CollectionMutation) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = Navigate.ADAPTER.decode(protoReader);
                    break;
                case 2:
                    obj2 = SetViewStateValue.ADAPTER.decode(protoReader);
                    break;
                case 3:
                    obj3 = OpenURL.ADAPTER.decode(protoReader);
                    break;
                case 4:
                    obj4 = CompoundAction.ADAPTER.decode(protoReader);
                    break;
                case 5:
                    obj5 = Submit.ADAPTER.decode(protoReader);
                    break;
                case 6:
                    obj6 = CollectionMutation.ADAPTER.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Action action = (Action) obj;
        reverseProtoWriter.getClass();
        action.getClass();
        reverseProtoWriter.writeBytes(action.unknownFields());
        CollectionMutation.ADAPTER.encodeWithTag(reverseProtoWriter, 6, action.collection_mutation);
        Submit.ADAPTER.encodeWithTag(reverseProtoWriter, 5, action.submit);
        CompoundAction.ADAPTER.encodeWithTag(reverseProtoWriter, 4, action.compound_action);
        OpenURL.ADAPTER.encodeWithTag(reverseProtoWriter, 3, action.open_url);
        SetViewStateValue.ADAPTER.encodeWithTag(reverseProtoWriter, 2, action.set_view_state_value);
        Navigate.ADAPTER.encodeWithTag(reverseProtoWriter, 1, action.navigate);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Action action = (Action) obj;
        action.getClass();
        return CollectionMutation.ADAPTER.encodedSizeWithTag(6, action.collection_mutation) + Submit.ADAPTER.encodedSizeWithTag(5, action.submit) + CompoundAction.ADAPTER.encodedSizeWithTag(4, action.compound_action) + OpenURL.ADAPTER.encodedSizeWithTag(3, action.open_url) + SetViewStateValue.ADAPTER.encodedSizeWithTag(2, action.set_view_state_value) + Navigate.ADAPTER.encodedSizeWithTag(1, action.navigate) + action.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Action action = (Action) obj;
        action.getClass();
        Navigate navigate = action.navigate;
        Navigate navigate2 = navigate != null ? (Navigate) Navigate.ADAPTER.redact(navigate) : null;
        SetViewStateValue setViewStateValue = action.set_view_state_value;
        SetViewStateValue setViewStateValue2 = setViewStateValue != null ? (SetViewStateValue) SetViewStateValue.ADAPTER.redact(setViewStateValue) : null;
        OpenURL openURL = action.open_url;
        OpenURL openURL2 = openURL != null ? (OpenURL) OpenURL.ADAPTER.redact(openURL) : null;
        CompoundAction compoundAction = action.compound_action;
        CompoundAction compoundAction2 = compoundAction != null ? (CompoundAction) CompoundAction.ADAPTER.redact(compoundAction) : null;
        Submit submit = action.submit;
        Submit submit2 = submit != null ? (Submit) Submit.ADAPTER.redact(submit) : null;
        CollectionMutation collectionMutation = action.collection_mutation;
        CollectionMutation collectionMutation2 = collectionMutation != null ? (CollectionMutation) CollectionMutation.ADAPTER.redact(collectionMutation) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Action(navigate2, setViewStateValue2, openURL2, compoundAction2, submit2, collectionMutation2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Action action = (Action) obj;
        action.getClass();
        Navigate.ADAPTER.encodeWithTag(protoWriter, 1, action.navigate);
        SetViewStateValue.ADAPTER.encodeWithTag(protoWriter, 2, action.set_view_state_value);
        OpenURL.ADAPTER.encodeWithTag(protoWriter, 3, action.open_url);
        CompoundAction.ADAPTER.encodeWithTag(protoWriter, 4, action.compound_action);
        Submit.ADAPTER.encodeWithTag(protoWriter, 5, action.submit);
        CollectionMutation.ADAPTER.encodeWithTag(protoWriter, 6, action.collection_mutation);
        protoWriter.writeBytes(action.unknownFields());
    }
}
