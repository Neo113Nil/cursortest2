package squareup.cash.earnings;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;
import squareup.cash.earnings.EarningTool;

/* loaded from: classes10.dex */
public final class EarningTool$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        EarningTool.Tool tool = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EarningTool(tool, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                tool = new EarningTool.Tool.EarnerMode((EarnerModeTool) EarnerModeTool.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                tool = new EarningTool.Tool.ManageCustomers((ManageCustomersTool) ManageCustomersTool.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                tool = new EarningTool.Tool.AddPaycheck((AddPaycheckTool) AddPaycheckTool.ADAPTER.decode(protoReader));
            } else if (nextTag == 4) {
                tool = new EarningTool.Tool.PaycheckDistribution((PaycheckDistributionTool) PaycheckDistributionTool.ADAPTER.decode(protoReader));
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                tool = new EarningTool.Tool.EarnerOnboarding((EarnerOnboardingTool) EarnerOnboardingTool.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EarningTool earningTool = (EarningTool) obj;
        reverseProtoWriter.getClass();
        earningTool.getClass();
        reverseProtoWriter.writeBytes(earningTool.unknownFields());
        EarningTool.Tool tool = earningTool.tool;
        if (tool instanceof EarningTool.Tool.EarnerMode) {
            EarnerModeTool.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((EarningTool.Tool.EarnerMode) tool).value);
            return;
        }
        if (tool instanceof EarningTool.Tool.ManageCustomers) {
            ManageCustomersTool.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((EarningTool.Tool.ManageCustomers) tool).value);
            return;
        }
        if (tool instanceof EarningTool.Tool.AddPaycheck) {
            AddPaycheckTool.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((EarningTool.Tool.AddPaycheck) tool).value);
            return;
        }
        if (tool instanceof EarningTool.Tool.PaycheckDistribution) {
            PaycheckDistributionTool.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((EarningTool.Tool.PaycheckDistribution) tool).value);
        } else if (tool instanceof EarningTool.Tool.EarnerOnboarding) {
            EarnerOnboardingTool.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((EarningTool.Tool.EarnerOnboarding) tool).value);
        } else {
            if (tool == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        EarningTool earningTool = (EarningTool) obj;
        earningTool.getClass();
        int size$okio = earningTool.unknownFields().getSize$okio();
        EarningTool.Tool tool = earningTool.tool;
        if (tool instanceof EarningTool.Tool.EarnerMode) {
            encodedSizeWithTag = EarnerModeTool.ADAPTER.encodedSizeWithTag(1, ((EarningTool.Tool.EarnerMode) tool).value);
        } else if (tool instanceof EarningTool.Tool.ManageCustomers) {
            encodedSizeWithTag = ManageCustomersTool.ADAPTER.encodedSizeWithTag(2, ((EarningTool.Tool.ManageCustomers) tool).value);
        } else if (tool instanceof EarningTool.Tool.AddPaycheck) {
            encodedSizeWithTag = AddPaycheckTool.ADAPTER.encodedSizeWithTag(3, ((EarningTool.Tool.AddPaycheck) tool).value);
        } else if (tool instanceof EarningTool.Tool.PaycheckDistribution) {
            encodedSizeWithTag = PaycheckDistributionTool.ADAPTER.encodedSizeWithTag(4, ((EarningTool.Tool.PaycheckDistribution) tool).value);
        } else {
            if (!(tool instanceof EarningTool.Tool.EarnerOnboarding)) {
                if (tool == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = EarnerOnboardingTool.ADAPTER.encodedSizeWithTag(5, ((EarningTool.Tool.EarnerOnboarding) tool).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EarningTool earningTool = (EarningTool) obj;
        earningTool.getClass();
        ByteString byteString = ByteString.EMPTY;
        EarningTool.Tool tool = earningTool.tool;
        byteString.getClass();
        return new EarningTool(tool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EarningTool earningTool = (EarningTool) obj;
        earningTool.getClass();
        EarningTool.Tool tool = earningTool.tool;
        if (tool instanceof EarningTool.Tool.EarnerMode) {
            EarnerModeTool.ADAPTER.encodeWithTag(protoWriter, 1, ((EarningTool.Tool.EarnerMode) tool).value);
        } else if (tool instanceof EarningTool.Tool.ManageCustomers) {
            ManageCustomersTool.ADAPTER.encodeWithTag(protoWriter, 2, ((EarningTool.Tool.ManageCustomers) tool).value);
        } else if (tool instanceof EarningTool.Tool.AddPaycheck) {
            AddPaycheckTool.ADAPTER.encodeWithTag(protoWriter, 3, ((EarningTool.Tool.AddPaycheck) tool).value);
        } else if (tool instanceof EarningTool.Tool.PaycheckDistribution) {
            PaycheckDistributionTool.ADAPTER.encodeWithTag(protoWriter, 4, ((EarningTool.Tool.PaycheckDistribution) tool).value);
        } else if (tool instanceof EarningTool.Tool.EarnerOnboarding) {
            EarnerOnboardingTool.ADAPTER.encodeWithTag(protoWriter, 5, ((EarningTool.Tool.EarnerOnboarding) tool).value);
        } else if (tool != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(earningTool.unknownFields());
    }
}
