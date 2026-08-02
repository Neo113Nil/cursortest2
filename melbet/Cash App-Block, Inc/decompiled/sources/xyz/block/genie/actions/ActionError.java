package xyz.block.genie.actions;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0006\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lxyz/block/genie/actions/ActionError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "MissingActionType", "MissingNavigationType", "InvalidURL", "ViewNotFoundInPlan", "MissingCollectionMutationOperation", "SubmitFailed", "Lxyz/block/genie/actions/ActionError$InvalidURL;", "Lxyz/block/genie/actions/ActionError$MissingActionType;", "Lxyz/block/genie/actions/ActionError$MissingCollectionMutationOperation;", "Lxyz/block/genie/actions/ActionError$MissingNavigationType;", "Lxyz/block/genie/actions/ActionError$SubmitFailed;", "Lxyz/block/genie/actions/ActionError$ViewNotFoundInPlan;", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class ActionError extends Exception {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxyz/block/genie/actions/ActionError$InvalidURL;", "Lxyz/block/genie/actions/ActionError;", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InvalidURL extends ActionError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxyz/block/genie/actions/ActionError$MissingActionType;", "Lxyz/block/genie/actions/ActionError;", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MissingActionType extends ActionError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxyz/block/genie/actions/ActionError$MissingCollectionMutationOperation;", "Lxyz/block/genie/actions/ActionError;", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MissingCollectionMutationOperation extends ActionError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxyz/block/genie/actions/ActionError$MissingNavigationType;", "Lxyz/block/genie/actions/ActionError;", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MissingNavigationType extends ActionError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxyz/block/genie/actions/ActionError$SubmitFailed;", "Lxyz/block/genie/actions/ActionError;", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SubmitFailed extends ActionError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxyz/block/genie/actions/ActionError$ViewNotFoundInPlan;", "Lxyz/block/genie/actions/ActionError;", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ViewNotFoundInPlan extends ActionError {
    }
}
