package com.squareup.cash.wallet.views;

import android.content.Context;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.graphics.HeartEdition;
import com.squareup.cash.card.onboarding.graphics.HeartPoseController;
import com.squareup.cash.card.onboarding.graphics.HeartScene;
import com.squareup.cash.card.onboarding.graphics.MiniCardEdition;
import com.squareup.cash.card.onboarding.graphics.MiniCardPoseController;
import com.squareup.cash.card.onboarding.graphics.MiniCardScene;
import com.squareup.cash.card.onboarding.graphics.TagPoseController;
import com.squareup.cash.card.onboarding.graphics.WandEdition;
import com.squareup.cash.card.onboarding.graphics.WandPose;
import com.squareup.cash.card.onboarding.graphics.WandPoseController;
import com.squareup.cash.card.onboarding.graphics.WandScene;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.wallet.data.TagFormFactor;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public final class PageTagSlot {
    public final TagPoseController controller;
    public final TagFormFactor formFactor;
    public float lastFrameTime;
    public final ParcelableSnapshotMutableState outputState;
    public final Scene scene;
    public final String tagIdentity;
    public final ParcelableSnapshotMutableIntState writerCount$delegate;

    public PageTagSlot(String str, TagFormFactor tagFormFactor, WandPose wandPose, Context context, Engine engine) {
        tagFormFactor.getClass();
        context.getClass();
        this.tagIdentity = str;
        this.formFactor = tagFormFactor;
        this.writerCount$delegate = new ParcelableSnapshotMutableIntState(0);
        int ordinal = tagFormFactor.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                throw null;
                            }
                        }
                    }
                }
                this.controller = new MiniCardPoseController(wandPose);
                this.scene = new MiniCardScene(context, engine, tagFormFactor == TagFormFactor.MINI_CARD_FIRST_EDITION ? MiniCardEdition.FIRST_EDITION : MiniCardEdition.STANDARD);
                this.outputState = Updater.mutableStateOf$default(this.controller.tick(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE));
            }
            this.controller = new HeartPoseController(wandPose, 0.028f);
            this.scene = new HeartScene(context, engine, tagFormFactor == TagFormFactor.HEART_FIRST_EDITION ? HeartEdition.FIRST_EDITION : HeartEdition.STANDARD);
            this.outputState = Updater.mutableStateOf$default(this.controller.tick(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE));
        }
        this.controller = new WandPoseController(wandPose);
        this.scene = new WandScene(context, engine, tagFormFactor == TagFormFactor.WAND_FIRST_EDITION ? WandEdition.FIRST_EDITION : WandEdition.STANDARD);
        this.outputState = Updater.mutableStateOf$default(this.controller.tick(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE));
    }

    public final void dispose() {
        Scene scene = this.scene;
        if (scene instanceof WandScene) {
            ((WandScene) scene).dispose();
            return;
        }
        if (scene instanceof HeartScene) {
            ((HeartScene) scene).dispose();
        } else if (scene instanceof MiniCardScene) {
            ((MiniCardScene) scene).dispose();
        } else {
            a$$ExternalSyntheticBUOutline0.m(Reflection.factory.getOrCreateKotlinClass(scene.getClass()), "Unhandled scene type in PageTagSlot.dispose: ");
        }
    }
}
