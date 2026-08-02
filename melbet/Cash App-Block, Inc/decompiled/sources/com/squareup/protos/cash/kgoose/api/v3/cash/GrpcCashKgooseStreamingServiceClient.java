package com.squareup.protos.cash.kgoose.api.v3.cash;

import com.squareup.wire.GrpcClient;
import com.squareup.wire.GrpcMethod;
import com.squareup.wire.WireGrpcClient;
import com.squareup.wire.internal.RealGrpcStreamingCall;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/cash/GrpcCashKgooseStreamingServiceClient;", "Lcom/squareup/protos/cash/kgoose/api/v3/cash/CashKgooseStreamingServiceClient;", "Lcom/squareup/wire/GrpcClient;", "client", "Lcom/squareup/wire/GrpcClient;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GrpcCashKgooseStreamingServiceClient implements CashKgooseStreamingServiceClient {
    private final GrpcClient client;

    public GrpcCashKgooseStreamingServiceClient(GrpcClient grpcClient) {
        this.client = grpcClient;
    }

    @Override // com.squareup.protos.cash.kgoose.api.v3.cash.CashKgooseStreamingServiceClient
    public final RealGrpcStreamingCall BidirectionalStreamMessagesV2() {
        GrpcClient grpcClient = this.client;
        GrpcMethod grpcMethod = new GrpcMethod("/squareup.cash.kgoose.api.v3.cash.CashKgooseStreamingService/BidirectionalStreamMessagesV2", RequestEnvelope.ADAPTER, ResponseEnvelopeV2.ADAPTER);
        WireGrpcClient wireGrpcClient = (WireGrpcClient) grpcClient;
        wireGrpcClient.getClass();
        return new RealGrpcStreamingCall(wireGrpcClient, grpcMethod);
    }
}
