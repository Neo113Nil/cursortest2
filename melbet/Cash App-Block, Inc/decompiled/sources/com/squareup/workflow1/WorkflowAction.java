package com.squareup.workflow1;

/* loaded from: classes8.dex */
public abstract class WorkflowAction {

    public final class Updater {
        public WorkflowOutput maybeOutput;
        public final Object props;
        public Object state;

        public Updater(WorkflowAction workflowAction, Object obj, Object obj2) {
            workflowAction.getClass();
            this.props = obj;
            this.state = obj2;
        }

        public final void setOutput(Object obj) {
            this.maybeOutput = new WorkflowOutput(obj);
        }
    }

    public abstract void apply(Updater updater);
}
