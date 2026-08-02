package kotlin.io;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.pager.MeasuredPage;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.IntOffset;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.sqldelight.driver.android.AndroidStatement;
import com.google.android.material.resources.MaterialAttributes;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.components.list.ListOrderedStandardItemsScope;
import com.squareup.cash.arcade.components.list.ListOrderedSubtleItemsScope;
import com.squareup.cash.banking.views.BenefitsLeafletViewKt$$ExternalSyntheticLambda25;
import com.squareup.cash.work.tinygraph.models.Job;
import com.squareup.workflow1.WorkflowAction;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.permissions.Permission;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflowUtilsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes9.dex */
public final /* synthetic */ class TextStreamsKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArrayList f$0;

    public /* synthetic */ TextStreamsKt$$ExternalSyntheticLambda0(int i, ArrayList arrayList) {
        this.$r8$classId = i;
        this.f$0 = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = 1;
        int i3 = 0;
        ArrayList<Pair> arrayList = this.f$0;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                arrayList.add(str);
                break;
            case 1:
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    MeasuredPage measuredPage = (MeasuredPage) arrayList.get(i4);
                    List list = measuredPage.placeables;
                    boolean z = measuredPage.isVertical;
                    if (measuredPage.mainAxisLayoutSize == Integer.MIN_VALUE) {
                        InlineClassHelperKt.throwIllegalArgumentException("position() should be called first");
                    }
                    int size2 = list.size();
                    int i5 = i3;
                    while (i5 < size2) {
                        Placeable placeable = (Placeable) list.get(i5);
                        int[] iArr = measuredPage.placeableOffsets;
                        int i6 = i5 * 2;
                        long m1049plusqkQi6aY = IntOffset.m1049plusqkQi6aY((iArr[i6 + i2] & BodyPartID.bodyIdMax) | (iArr[i6] << 32), measuredPage.visualOffset);
                        if (z) {
                            Placeable.PlacementScope.m856placeWithLayeraW9wM$default(placementScope, placeable, m1049plusqkQi6aY, null, 6);
                        } else {
                            Placeable.PlacementScope.m855placeRelativeWithLayeraW9wM$default(placementScope, placeable, m1049plusqkQi6aY);
                        }
                        i5++;
                        i2 = 1;
                    }
                    i4++;
                    i2 = 1;
                    i3 = 0;
                }
                break;
            case 2:
                Placeable.PlacementScope placementScope2 = (Placeable.PlacementScope) obj;
                int size3 = arrayList.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    placementScope2.placeRelative((Placeable) arrayList.get(i7), 0, 0, RecyclerView.DECELERATION_RATE);
                }
                break;
            case 3:
                Placeable.PlacementScope placementScope3 = (Placeable.PlacementScope) obj;
                int size4 = arrayList.size();
                for (int i8 = 0; i8 < size4; i8++) {
                    placementScope3.place((Placeable) arrayList.get(i8), 0, 0, RecyclerView.DECELERATION_RATE);
                }
                break;
            case 4:
                Placeable.PlacementScope placementScope4 = (Placeable.PlacementScope) obj;
                placementScope4.getClass();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    placementScope4.placeRelative((Placeable) it.next(), 0, 0, RecyclerView.DECELERATION_RATE);
                }
                break;
            case 5:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    androidStatement.bindString(i3, (String) it2.next());
                    i3++;
                }
                break;
            case 6:
                ListOrderedSubtleItemsScope listOrderedSubtleItemsScope = (ListOrderedSubtleItemsScope) obj;
                listOrderedSubtleItemsScope.getClass();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    listOrderedSubtleItemsScope.item(new ComposableLambdaImpl(new BenefitsLeafletViewKt$$ExternalSyntheticLambda25((AnnotatedString) ((Pair) it3.next()).first, 6), true, 1959004098));
                }
                break;
            case 7:
                ListOrderedStandardItemsScope listOrderedStandardItemsScope = (ListOrderedStandardItemsScope) obj;
                listOrderedStandardItemsScope.getClass();
                for (Pair pair : arrayList) {
                    AnnotatedString annotatedString = (AnnotatedString) pair.first;
                    AnnotatedString annotatedString2 = (AnnotatedString) pair.second;
                    listOrderedStandardItemsScope.item(new ComposableLambdaImpl(new BenefitsLeafletViewKt$$ExternalSyntheticLambda25(annotatedString, 7), true, -1844048359), annotatedString2 != null ? new ComposableLambdaImpl(new BenefitsLeafletViewKt$$ExternalSyntheticLambda25(annotatedString2, 8), true, 1815686571) : null);
                }
                break;
            case 8:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    androidStatement2.bindString(i3, (String) it4.next());
                    i3++;
                }
                break;
            case 9:
                Placeable.PlacementScope placementScope5 = (Placeable.PlacementScope) obj;
                placementScope5.getClass();
                Iterator it5 = arrayList.iterator();
                int i9 = 0;
                while (it5.hasNext()) {
                    Placeable placeable2 = (Placeable) it5.next();
                    placementScope5.placeRelative(placeable2, 0, i9, RecyclerView.DECELERATION_RATE);
                    i9 += placeable2.height;
                }
                break;
            case 10:
                Job job = (Job) obj;
                job.getClass();
                break;
            case 11:
                WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                updater.getClass();
                GovernmentIdState governmentIdState = (GovernmentIdState) updater.state;
                if (governmentIdState instanceof GovernmentIdState.WaitForAutocapture) {
                    updater.state = GovernmentIdState.WaitForAutocapture.copy$default((GovernmentIdState.WaitForAutocapture) governmentIdState, null, null, null, arrayList.contains(Permission.Camera), arrayList.contains(Permission.RecordAudio), null, 29695);
                } else {
                    governmentIdState.deleteAllIds();
                    updater.state = new GovernmentIdState.ShowInstructions(governmentIdState.getCountryCode$government_id_release());
                }
                break;
            case 12:
                WorkflowAction.Updater updater2 = (WorkflowAction.Updater) obj;
                updater2.getClass();
                SelfieState selfieState = (SelfieState) updater2.state;
                if (selfieState instanceof SelfieState.WaitForCameraFeed) {
                    updater2.state = SelfieState.WaitForCameraFeed.copy$default((SelfieState.WaitForCameraFeed) selfieState, !arrayList.contains(Permission.Camera), !arrayList.contains(Permission.RecordAudio), false, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                } else {
                    MaterialAttributes.deleteAllSelfies(selfieState);
                    updater2.state = new SelfieState.RestartCamera(false, false, SelfieWorkflowUtilsKt.createBackState(updater2, false), ((SelfieState) updater2.state).getCameraFacingMode$selfie_release());
                }
                break;
            case 13:
                WorkflowAction.Updater updater3 = (WorkflowAction.Updater) obj;
                updater3.getClass();
                Object obj2 = updater3.state;
                SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = obj2 instanceof SelfieState.FinalizeLocalVideoCapture ? (SelfieState.FinalizeLocalVideoCapture) obj2 : null;
                if (finalizeLocalVideoCapture == null) {
                    break;
                } else {
                    updater3.state = SelfieState.FinalizeLocalVideoCapture.copy$default(finalizeLocalVideoCapture, CollectionsKt.plus((Iterable) arrayList, (Collection) ((SelfieState) obj2).getSelfies$selfie_release()), EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE);
                    break;
                }
            default:
                String str2 = (String) obj;
                str2.getClass();
                arrayList.add(str2);
                break;
        }
        return Unit.INSTANCE;
    }
}
