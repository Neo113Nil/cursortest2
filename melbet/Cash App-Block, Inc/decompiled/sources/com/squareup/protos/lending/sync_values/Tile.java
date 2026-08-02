package com.squareup.protos.lending.sync_values;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ResourceEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.giftly.GiftCard;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.protos.lending.sync_values.BorrowAppletCreditLimitAndBorrowButtonTile;
import com.squareup.protos.lending.sync_values.BorrowAppletLinksTile;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import com.squareup.protos.lending.sync_values.BorrowAppletPaymentTimelineTile;
import com.squareup.wire.AndroidMessage;
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

/* loaded from: classes8.dex */
public final class Tile extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Tile> CREATOR;
    public final List app_supports;
    public final AbstractC0074Tile tile;
    public final Color tint_color;

    /* renamed from: com.squareup.protos.lending.sync_values.Tile$Tile, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public abstract class AbstractC0074Tile {

        /* renamed from: com.squareup.protos.lending.sync_values.Tile$Tile$BorrowAppletBulletinsTile */
        /* loaded from: classes8.dex */
        public final class BorrowAppletBulletinsTile extends AbstractC0074Tile {
            public final BorrowAppletBulletinsTile.Data value;

            public BorrowAppletBulletinsTile(BorrowAppletBulletinsTile.Data data) {
                data.getClass();
                this.value = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BorrowAppletBulletinsTile) && Intrinsics.areEqual(this.value, ((BorrowAppletBulletinsTile) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "BorrowAppletBulletinsTile(value=" + this.value + ")";
            }
        }

        /* renamed from: com.squareup.protos.lending.sync_values.Tile$Tile$BorrowAppletLinksTile */
        /* loaded from: classes8.dex */
        public final class BorrowAppletLinksTile extends AbstractC0074Tile {
            public final BorrowAppletLinksTile.Data value;

            public BorrowAppletLinksTile(BorrowAppletLinksTile.Data data) {
                data.getClass();
                this.value = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BorrowAppletLinksTile) && Intrinsics.areEqual(this.value, ((BorrowAppletLinksTile) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "BorrowAppletLinksTile(value=" + this.value + ")";
            }
        }

        /* renamed from: com.squareup.protos.lending.sync_values.Tile$Tile$BorrowAppletLoanHistoryTile */
        /* loaded from: classes8.dex */
        public final class BorrowAppletLoanHistoryTile extends AbstractC0074Tile {
            public final BorrowAppletLoanHistoryTile.Data value;

            public BorrowAppletLoanHistoryTile(BorrowAppletLoanHistoryTile.Data data) {
                data.getClass();
                this.value = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BorrowAppletLoanHistoryTile) && Intrinsics.areEqual(this.value, ((BorrowAppletLoanHistoryTile) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "BorrowAppletLoanHistoryTile(value=" + this.value + ")";
            }
        }

        /* renamed from: com.squareup.protos.lending.sync_values.Tile$Tile$BorrowAppletPaymentTimelineTile */
        /* loaded from: classes8.dex */
        public final class BorrowAppletPaymentTimelineTile extends AbstractC0074Tile {
            public final BorrowAppletPaymentTimelineTile.Data value;

            public BorrowAppletPaymentTimelineTile(BorrowAppletPaymentTimelineTile.Data data) {
                data.getClass();
                this.value = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BorrowAppletPaymentTimelineTile) && Intrinsics.areEqual(this.value, ((BorrowAppletPaymentTimelineTile) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "BorrowAppletPaymentTimelineTile(value=" + this.value + ")";
            }
        }

        /* renamed from: com.squareup.protos.lending.sync_values.Tile$Tile$CreditLimitAndBorrowButtonTile */
        /* loaded from: classes8.dex */
        public final class CreditLimitAndBorrowButtonTile extends AbstractC0074Tile {
            public final BorrowAppletCreditLimitAndBorrowButtonTile.Data value;

            public CreditLimitAndBorrowButtonTile(BorrowAppletCreditLimitAndBorrowButtonTile.Data data) {
                data.getClass();
                this.value = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CreditLimitAndBorrowButtonTile) && Intrinsics.areEqual(this.value, ((CreditLimitAndBorrowButtonTile) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CreditLimitAndBorrowButtonTile(value=" + this.value + ")";
            }
        }

        public static ResourceEvent.Worker fromJsonObject(JsonObject jsonObject) {
            try {
                return new ResourceEvent.Worker(jsonObject.get("duration").getAsLong(), jsonObject.get("start").getAsLong());
            } catch (IllegalStateException e) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Worker", e);
                return null;
            } catch (NullPointerException e2) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Worker", e2);
                return null;
            } catch (NumberFormatException e3) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Worker", e3);
                return null;
            }
        }
    }

    static {
        Tile$Companion$ADAPTER$1 tile$Companion$ADAPTER$1 = new Tile$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Tile.class), "type.googleapis.com/squareup.lending.sync_values.Tile", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
        ADAPTER = tile$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(tile$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tile(List list, Color color, AbstractC0074Tile abstractC0074Tile, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.tint_color = color;
        this.tile = abstractC0074Tile;
        this.app_supports = TransactorKt.immutableCopyOf("app_supports", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Tile)) {
            return false;
        }
        Tile tile = (Tile) obj;
        return Intrinsics.areEqual(unknownFields(), tile.unknownFields()) && Intrinsics.areEqual(this.app_supports, tile.app_supports) && Intrinsics.areEqual(this.tint_color, tile.tint_color) && Intrinsics.areEqual(this.tile, tile.tile);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.app_supports);
        Color color = this.tint_color;
        int hashCode = (m + (color != null ? color.hashCode() : 0)) * 37;
        AbstractC0074Tile abstractC0074Tile = this.tile;
        int hashCode2 = hashCode + (abstractC0074Tile != null ? abstractC0074Tile.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Options.Builder builder = new GiftCard.Options.Builder(24);
        builder.label = this.app_supports;
        builder.localizable_label = this.tint_color;
        builder.client_scenario = this.tile;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.app_supports;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("app_supports=", arrayList, list);
        }
        Color color = this.tint_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("tint_color=", color, arrayList);
        }
        AbstractC0074Tile abstractC0074Tile = this.tile;
        if (abstractC0074Tile != null) {
            arrayList.add("tile=" + abstractC0074Tile);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Tile{", "}", 0, null, null, 56);
    }
}
