package com.crrepa.band.my.model.net;

/* loaded from: classes2.dex */
public class CustomerServiceStateEntity {
    public static final int BOUNDED_STATE = 1;
    public static final int UNBOUND_STATE = 0;
    private State data;
    private String message;
    private int status;

    public static class State {
        private int company_id;
        private int is_bound;
        private int num;

        public int getCompany_id() {
            return this.company_id;
        }

        public int getIs_bound() {
            return this.is_bound;
        }

        public int getNum() {
            return this.num;
        }

        public void setCompany_id(int i8) {
            this.company_id = i8;
        }

        public void setIs_bound(int i8) {
            this.is_bound = i8;
        }

        public void setNum(int i8) {
            this.num = i8;
        }
    }

    public State getState() {
        return this.data;
    }

    public int getStatus() {
        return this.status;
    }

    public void setState(State state) {
        this.data = state;
    }

    public void setStatus(int i8) {
        this.status = i8;
    }
}
