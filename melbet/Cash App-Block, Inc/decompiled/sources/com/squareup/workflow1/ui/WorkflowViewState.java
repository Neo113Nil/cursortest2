package com.squareup.workflow1.ui;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class WorkflowViewState {

    public final class New extends WorkflowViewState {
        public final ViewEnvironment environment;
        public final Function2 showRendering;
        public final Object showing;
        public final Function1 starter;

        public New(Object obj, ViewEnvironment viewEnvironment, Function2 function2, Function1 function1) {
            obj.getClass();
            viewEnvironment.getClass();
            function1.getClass();
            this.showing = obj;
            this.environment = viewEnvironment;
            this.showRendering = function2;
            this.starter = function1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof New)) {
                return false;
            }
            New r3 = (New) obj;
            return Intrinsics.areEqual(this.showing, r3.showing) && Intrinsics.areEqual(this.environment, r3.environment) && this.showRendering.equals(r3.showRendering) && Intrinsics.areEqual(this.starter, r3.starter);
        }

        @Override // com.squareup.workflow1.ui.WorkflowViewState
        public final ViewEnvironment getEnvironment() {
            return this.environment;
        }

        @Override // com.squareup.workflow1.ui.WorkflowViewState
        public final Function2 getShowRendering() {
            return this.showRendering;
        }

        @Override // com.squareup.workflow1.ui.WorkflowViewState
        public final Object getShowing() {
            return this.showing;
        }

        public final int hashCode() {
            return this.starter.hashCode() + ((this.showRendering.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.showing.hashCode() * 31, this.environment.map, 31)) * 31);
        }

        public final String toString() {
            return "New(showing=" + this.showing + ", environment=" + this.environment + ", showRendering=" + this.showRendering + ", starter=" + this.starter + ')';
        }
    }

    public final class Started extends WorkflowViewState {
        public final ViewEnvironment environment;
        public final Function2 showRendering;
        public final Object showing;

        public Started(Object obj, ViewEnvironment viewEnvironment, Function2 function2) {
            obj.getClass();
            viewEnvironment.getClass();
            this.showing = obj;
            this.environment = viewEnvironment;
            this.showRendering = function2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Started)) {
                return false;
            }
            Started started = (Started) obj;
            return Intrinsics.areEqual(this.showing, started.showing) && Intrinsics.areEqual(this.environment, started.environment) && this.showRendering.equals(started.showRendering);
        }

        @Override // com.squareup.workflow1.ui.WorkflowViewState
        public final ViewEnvironment getEnvironment() {
            return this.environment;
        }

        @Override // com.squareup.workflow1.ui.WorkflowViewState
        public final Function2 getShowRendering() {
            return this.showRendering;
        }

        @Override // com.squareup.workflow1.ui.WorkflowViewState
        public final Object getShowing() {
            return this.showing;
        }

        public final int hashCode() {
            return this.showRendering.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.showing.hashCode() * 31, this.environment.map, 31);
        }

        public final String toString() {
            return "Started(showing=" + this.showing + ", environment=" + this.environment + ", showRendering=" + this.showRendering + ')';
        }
    }

    public abstract ViewEnvironment getEnvironment();

    public abstract Function2 getShowRendering();

    public abstract Object getShowing();
}
