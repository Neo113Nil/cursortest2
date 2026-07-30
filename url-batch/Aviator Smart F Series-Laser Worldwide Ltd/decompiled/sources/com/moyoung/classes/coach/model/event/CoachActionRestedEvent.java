package com.moyoung.classes.coach.model.event;

/* loaded from: classes4.dex */
public class CoachActionRestedEvent {
    private final int restSeconds;

    public CoachActionRestedEvent(int i8) {
        this.restSeconds = i8;
    }

    public int getRestSeconds() {
        return this.restSeconds;
    }
}
